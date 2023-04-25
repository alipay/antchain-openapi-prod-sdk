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

    // 租户来源-用于租户间功能和数据的隔离
    /**
     * @var string
     */
    public $source;
    protected $_name = [
        'authToken' => 'auth_token',
        'instName'  => 'inst_name',
        'source'    => 'source',
    ];

    public function validate()
    {
        Model::validateRequired('instName', $this->instName, true);
        Model::validateRequired('source', $this->source, true);
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
        if (null !== $this->source) {
            $res['source'] = $this->source;
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
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }

        return $model;
    }
}
