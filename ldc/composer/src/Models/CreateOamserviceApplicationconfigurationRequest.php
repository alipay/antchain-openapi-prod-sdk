<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class CreateOamserviceApplicationconfigurationRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // ApplicationConfiguration yaml字符串
    /**
     * @var string
     */
    public $yamlcontent;
    protected $_name = [
        'authToken'   => 'auth_token',
        'yamlcontent' => 'yamlcontent',
    ];

    public function validate()
    {
        Model::validateRequired('yamlcontent', $this->yamlcontent, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->yamlcontent) {
            $res['yamlcontent'] = $this->yamlcontent;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateOamserviceApplicationconfigurationRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['yamlcontent'])) {
            $model->yamlcontent = $map['yamlcontent'];
        }

        return $model;
    }
}
