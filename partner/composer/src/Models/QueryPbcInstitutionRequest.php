<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PARTNER\Models;

use AlibabaCloud\Tea\Model;

class QueryPbcInstitutionRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 机构名称关键字
    /**
     * @var string
     */
    public $instName;
    protected $_name = [
        'authToken' => 'auth_token',
        'instName'  => 'inst_name',
    ];

    public function validate()
    {
        Model::validateRequired('instName', $this->instName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->instName) {
            $res['inst_name'] = $this->instName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryPbcInstitutionRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['inst_name'])) {
            $model->instName = $map['inst_name'];
        }

        return $model;
    }
}
