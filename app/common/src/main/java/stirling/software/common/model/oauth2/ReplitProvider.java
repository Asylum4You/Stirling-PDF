package stirling.software.common.model.oauth2;

import java.util.ArrayList;
import java.util.Collection;

import lombok.NoArgsConstructor;

import stirling.software.common.model.enumeration.UsernameAttribute;

@NoArgsConstructor
public class ReplitProvider extends Provider {

    private static final String NAME = "replit";
    private static final String CLIENT_NAME = "Replit";
    private static final String AUTHORIZATION_URI = "https://replit.com/oauth2/authorize";
    private static final String TOKEN_URI = "https://replit.com/oauth2/token";
    private static final String USER_INFO_URI = "https://replit.com/api/graphql";

    public ReplitProvider(
            String clientId,
            String clientSecret,
            Collection<String> scopes,
            UsernameAttribute useAsUsername) {
        super(
                null,
                NAME,
                CLIENT_NAME,
                clientId,
                clientSecret,
                scopes,
                useAsUsername != null ? useAsUsername : UsernameAttribute.NAME,
                AUTHORIZATION_URI,
                TOKEN_URI,
                USER_INFO_URI);
    }

    @Override
    public String getAuthorizationUri() {
        return AUTHORIZATION_URI;
    }

    @Override
    public String getTokenUri() {
        return TOKEN_URI;
    }

    @Override
    public String getUserInfoUri() {
        return USER_INFO_URI;
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public String getClientName() {
        return CLIENT_NAME;
    }

    @Override
    public Collection<String> getScopes() {
        Collection<String> scopes = super.getScopes();

        if (scopes == null || scopes.isEmpty()) {
            scopes = new ArrayList<>();
            scopes.add("user");
        }

        return scopes;
    }

    @Override
    public String toString() {
        return "Replit [clientId="
                + getClientId()
                + ", clientSecret="
                + (getClientSecret() != null && !getClientSecret().isEmpty() ? "*****" : "NULL")
                + ", scopes="
                + getScopes()
                + ", useAsUsername="
                + getUseAsUsername()
                + "]";
    }
}
