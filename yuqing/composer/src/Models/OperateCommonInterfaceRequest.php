<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUQING\Models;

use AlibabaCloud\Tea\Model;

class OperateCommonInterfaceRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 入参JSON
    /**
     * @var string
     */
    public $paramJson;

    // 接口名称
    /**
     * @var string
     */
    public $interfaceName;

    // 请求ID
    /**
     * @var string
     */
    public $requestId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'paramJson'         => 'param_json',
        'interfaceName'     => 'interface_name',
        'requestId'         => 'request_id',
    ];

    public function validate()
    {
        Model::validateRequired('paramJson', $this->paramJson, true);
        Model::validateRequired('interfaceName', $this->interfaceName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->paramJson) {
            $res['param_json'] = $this->paramJson;
        }
        if (null !== $this->interfaceName) {
            $res['interface_name'] = $this->interfaceName;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OperateCommonInterfaceRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['param_json'])) {
            $model->paramJson = $map['param_json'];
        }
        if (isset($map['interface_name'])) {
            $model->interfaceName = $map['interface_name'];
        }
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }

        return $model;
    }
}
