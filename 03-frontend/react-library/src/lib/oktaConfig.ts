export const oktaConfig = {
    clientId: '0oamakl5m0G9bvpIr5d7',
    issuer: 'https://dev-91674538.okta.com/oauth2/default',
    redirectUri: 'http://localhost:3000/login/callback',
    scopes: ['openid', 'profile', 'email'],
    pkce: true,
    disableHttpsCheck: true
}