<?php

if (file_exists(__DIR__ . \DIRECTORY_SEPARATOR . 'vendor' . \DIRECTORY_SEPARATOR . 'autoload.php')) {
    require_once __DIR__ . \DIRECTORY_SEPARATOR . 'vendor' . \DIRECTORY_SEPARATOR . 'autoload.php';
}

spl_autoload_register(function ($class) {
    $name = str_replace('AntChain\\Ak_bb3e5638866e4c77aa9ae8ac5c14e933\\', '', $class);
    $file = __DIR__ . \DIRECTORY_SEPARATOR . 'src' . \DIRECTORY_SEPARATOR . str_replace('\\', \DIRECTORY_SEPARATOR, $name) . '.php';
    if (file_exists($file)) {
        require_once $file;

        return true;
    }

    return false;
});
