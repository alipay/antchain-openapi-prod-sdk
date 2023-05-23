<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_a1f82644937c486c81a62b0e5a6b4fbe\Models;

use AlibabaCloud\Tea\Model;

class ApiInfo extends Model
{
    // 查询不动产接口
    /**
     * @example queryA
     *
     * @var string
     */
    public $apiCode;

    // api pb文件定义
    /**
     * @example api
     *
     * @var string
     */
    public $apiProtobufDefinition;
    protected $_name = [
        'apiCode'               => 'api_code',
        'apiProtobufDefinition' => 'api_protobuf_definition',
    ];

    public function validate()
    {
        Model::validateRequired('apiCode', $this->apiCode, true);
        Model::validateRequired('apiProtobufDefinition', $this->apiProtobufDefinition, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->apiCode) {
            $res['api_code'] = $this->apiCode;
        }
        if (null !== $this->apiProtobufDefinition) {
            $res['api_protobuf_definition'] = $this->apiProtobufDefinition;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApiInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['api_code'])) {
            $model->apiCode = $map['api_code'];
        }
        if (isset($map['api_protobuf_definition'])) {
            $model->apiProtobufDefinition = $map['api_protobuf_definition'];
        }

        return $model;
    }
}
