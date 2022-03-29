<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class QueryKernelstackGeneratedconfigRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 不带租户id和workspaceId的universalTableId后缀
    /**
     * @var string
     */
    public $simpleTableId;
    protected $_name = [
        'authToken'     => 'auth_token',
        'simpleTableId' => 'simple_table_id',
    ];

    public function validate()
    {
        Model::validateRequired('simpleTableId', $this->simpleTableId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->simpleTableId) {
            $res['simple_table_id'] = $this->simpleTableId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryKernelstackGeneratedconfigRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['simple_table_id'])) {
            $model->simpleTableId = $map['simple_table_id'];
        }

        return $model;
    }
}
