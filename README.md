# basicSecurity
Basic Spring security

Works after the second commit:
- super(true) in SecurityConfig deleted
- daca precizezi loginPage, spring se asteapta sa ai tu una scrisa de mana si nu mai genereaza 
(do not use http.formLogin().loginPage("/login").permitAll() because so Spring waits for a login page written by you)
