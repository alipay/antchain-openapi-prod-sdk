<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class XKeyJson extends Model
{
    /**
     * @example
     *
     * @var string
     */
    public $key;

    // json string
    /**
     * @example
     *
     * @var string
     */
    public $json;
    protected $_name = [
        'key'  => 'key',
        'json' => 'json',
    ];

    public function validate()
    {
        Model::validateRequired('key', $this->key, true);
        Model::validateRequired('json', $this->json, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->key) {
            $res['key'] = $this->key;
        }
        if (null !== $this->json) {
            $res['json'] = $this->json;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return XKeyJson
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['key'])) {
            $model->key = $map['key'];
        }
        if (isset($map['json'])) {
            $model->json = $map['json'];
        }

        return $model;
    }
}
