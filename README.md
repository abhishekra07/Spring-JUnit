# Spring-JUnit
This project shows how to write unit test cases in spring boot application

## @RunWith(SpringJUnit4ClassRunner.class)
Helps to change junit runner for unit testing. In spring boot applications its prefered to use SpringJUnit4ClassRunner.

## @SpringBootTest
Tells spring to create apllication context and manage dependency Injection by its own.It creates all beans in your entire application. so its not advisable if you ahve too many benas.

## @ContextConfigurations(classes = {UserService.class})
this annotation helps to create bean for defined classes only instead on entire application.

## @MockBean
Sometimes in unit testing we dont want to make actual call to DB or any service, we can use Above annotation which will mock service(give dummy bean) and with the help of Mockito we can mock that service call and perform testing.

### Mockito Example :- when(utility.checkForNullValueOrEmptyString(Mockito.anyString())).thenReturn(true);
this tells mock service which method to intercept and what response to return.

## @SpyBean
Use above annotation instead of @Autowired or @MockBean if you want to mock only some methods.

# Tip
@Autowire service/component to test and @mMckBean all the dependencies.
