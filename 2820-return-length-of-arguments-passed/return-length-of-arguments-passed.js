/**
 * @param {...(null|boolean|number|string|Array|Object)} args
 * @return {number}
 */
var argumentsLength = function(...args) {
    return args.slice(0, args.length).length 

};

/**
 * argumentsLength(1, 2, 3); // 3
 */