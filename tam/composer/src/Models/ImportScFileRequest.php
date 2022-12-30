<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAM\Models;

use AlibabaCloud\Tea\Model;

class ImportScFileRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $key;

    /**
     * @var string
     */
    public $fileName;

    /**
     * @var string
     */
    public $businessName;
    protected $_name = [
        'authToken'    => 'auth_token',
        'key'          => 'key',
        'fileName'     => 'file_name',
        'businessName' => 'business_name',
    ];

    public function validate()
    {
        Model::validateRequired('key', $this->key, true);
        Model::validateRequired('fileName', $this->fileName, true);
        Model::validateRequired('businessName', $this->businessName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->key) {
            $res['key'] = $this->key;
        }
        if (null !== $this->fileName) {
            $res['file_name'] = $this->fileName;
        }
        if (null !== $this->businessName) {
            $res['business_name'] = $this->businessName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ImportScFileRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['key'])) {
            $model->key = $map['key'];
        }
        if (isset($map['file_name'])) {
            $model->fileName = $map['file_name'];
        }
        if (isset($map['business_name'])) {
            $model->businessName = $map['business_name'];
        }

        return $model;
    }
}
