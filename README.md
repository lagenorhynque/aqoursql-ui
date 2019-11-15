# aqoursql-ui

AqoursQL UI, an example GraphQL frontend based on [re-frame](https://github.com/day8/re-frame) & [re-graph](https://github.com/oliyh/re-graph).

## Development Mode

### Start CIDER from Emacs:

Refer to the [shadow-cljs Emacs / CIDER documentation](https://shadow-cljs.github.io/docs/UsersGuide.html#cider).

The mentioned `dir-local.el` file has been created.

### Run application:

```sh
$ lein dev
```

[shadow-cljs](https://github.com/thheller/shadow-cljs) will automatically push cljs changes to the browser.

Wait a bit, then browse to [http://localhost:8280](http://localhost:8280).

### Run tests:

Install karma and headless chrome

```sh
$ npm install -g karma-cli
```

And then run your tests

```sh
$ lein karma
```

## Production Build

### Build for production:

```sh
$ lein prod
```
