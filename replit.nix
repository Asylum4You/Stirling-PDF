{pkgs}: {
  deps = [
    pkgs.leptonica
    pkgs.zlib
    pkgs.pkg-config
    pkgs.libtool_2
    pkgs.autoconf271
    pkgs.automake
    pkgs.libgccjit
    pkgs.gnumake
    pkgs.python312Packages.cleanlab
    pkgs.haskellPackages.nixpkgs-update
  ];
}
