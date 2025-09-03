# Overview

Stirling-PDF is a robust, locally hosted web-based PDF manipulation tool that provides 50+ PDF operations through a user-friendly interface. The application enables users to perform various PDF operations including merging, splitting, rotating, converting, OCR processing, security operations, and advanced editing features. All file processing occurs locally with files existing only on the client side or temporarily in server memory during task execution, ensuring privacy and security.

## Recent Optimizations (January 2025)
- **Image Size Reduction**: Removed large optional dependencies (Desktop UI components, development tools) to reduce Docker image size below 8GB limit
- **Deployment Optimization**: Configured single port (8080) for cloud deployment, removed dual port configuration
- **Build Improvements**: Enhanced .dockerignore to exclude unnecessary files, disabled non-essential image format support
- **File Cleanup**: Removed testing directories, documentation images, and build artifacts to minimize deployment size
- **Cloud Run Compatibility**: Updated temporary directory configuration from `/tmp/stirling-pdf` to `/tmp` to avoid read-only filesystem issues in Cloud Run, ensured server binds to 0.0.0.0 for network accessibility

# User Preferences

Preferred communication style: Simple, everyday language.

# System Architecture

## Core Technology Stack
- **Backend Framework**: Spring Boot with Thymeleaf templating engine for server-side rendering
- **PDF Processing**: PDFBox as the primary PDF manipulation library with additional tools like qpdf for advanced operations
- **Document Conversion**: LibreOffice for office document to PDF conversion
- **OCR Capabilities**: Tesseract OCR engine with support for multiple language packs
- **Frontend**: HTML5, CSS3, JavaScript with PDF.js for client-side PDF viewing and PDF-LIB.js for browser-based operations
- **Build System**: Gradle for dependency management and build automation
- **Code Enhancement**: Lombok for reducing boilerplate code

## Application Architecture
- **Containerized Deployment**: Docker-first approach with comprehensive Docker Compose configurations
- **Multi-Module Structure**: Organized into core and proprietary modules for feature separation
- **Authentication System**: Optional login and authentication support with role-based access control (admin/user roles)
- **Pipeline System**: Custom automation pipelines for chaining multiple PDF operations
- **API-First Design**: RESTful API endpoints for all operations enabling external integrations

## Data Management
- **Database System**: Built-in database with backup and import functionality for user management and settings
- **File Processing**: Stateless file processing with temporary file handling during operations
- **Configuration**: Extensive configuration options through environment variables and property files

## Security Features
- **Local Processing**: All PDF operations performed locally without external service dependencies
- **Authentication**: Optional user authentication with admin privileges
- **File Security**: PDF password protection, digital signatures, and sanitization capabilities
- **Access Control**: Role-based permissions and user management system

## Internationalization
- **Multi-Language Support**: Comprehensive i18n system with property files for different locales
- **Translation Management**: Structured approach for adding new languages with validation scripts
- **UI Localization**: Full interface translation support with direction handling for RTL languages

# External Dependencies

## Core PDF Processing
- **PDFBox**: Primary PDF manipulation and processing library
- **qpdf**: Advanced PDF operations and repair functionality
- **Tesseract OCR**: Text recognition engine with downloadable language packs

## Document Conversion
- **LibreOffice**: Office document conversion to PDF format
- **UnoServer/UnoConvert**: Document conversion service integration

## Frontend Libraries
- **PDF.js**: Client-side PDF rendering and viewing
- **PDF-LIB.js**: Browser-based PDF manipulation
- **Bootstrap**: UI framework for responsive design
- **Material Symbols**: Icon system for consistent UI elements

## Development Tools
- **Docker**: Containerization platform for deployment
- **Node.js/NPM**: Frontend build tools and CSS linting
- **Stylelint**: CSS code quality and formatting
- **Pre-commit**: Code quality enforcement hooks

## Optional Enterprise Features
- **SAML Integration**: Single Sign-On (SSO) support for enterprise deployments
- **Database Systems**: Support for external database backends
- **Monitoring Tools**: Application performance and usage monitoring

## Build and Testing
- **Gradle**: Build automation and dependency management
- **Cucumber**: Behavior-driven testing framework
- **JUnit**: Unit testing framework
- **Behave**: Python-based acceptance testing