<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class StartDidAgentServicetypeRequest extends Model
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

    // 枚举类型，描述访问服务的方式
    /**
     * @var string
     */
    public $accessMode;

    // 对服务的文字描述，<1000个字符
    /**
     * @var string
     */
    public $description;

    // 服务类型创建者did
    /**
     * @var string
     */
    public $did;

    // {
    // "item1":"",
    // "item2":"",
    // ...
    // }
    /**
     * @var string
     */
    public $serviceInput;

    // {
    // "item1":""
    // "item2":""
    // ...
    // }
    /**
     * @var string
     */
    public $serviceOutput;

    // 自定义服务类型，字符数16～32个
    /**
     * @var string
     */
    public $serviceType;

    // 场景码，找dis工作人员进行分配
    /**
     * @var string
     */
    public $bizCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'accessMode'        => 'access_mode',
        'description'       => 'description',
        'did'               => 'did',
        'serviceInput'      => 'service_input',
        'serviceOutput'     => 'service_output',
        'serviceType'       => 'service_type',
        'bizCode'           => 'biz_code',
    ];

    public function validate()
    {
        Model::validateRequired('did', $this->did, true);
        Model::validateRequired('serviceType', $this->serviceType, true);
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
        if (null !== $this->accessMode) {
            $res['access_mode'] = $this->accessMode;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }
        if (null !== $this->serviceInput) {
            $res['service_input'] = $this->serviceInput;
        }
        if (null !== $this->serviceOutput) {
            $res['service_output'] = $this->serviceOutput;
        }
        if (null !== $this->serviceType) {
            $res['service_type'] = $this->serviceType;
        }
        if (null !== $this->bizCode) {
            $res['biz_code'] = $this->bizCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartDidAgentServicetypeRequest
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
        if (isset($map['access_mode'])) {
            $model->accessMode = $map['access_mode'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }
        if (isset($map['service_input'])) {
            $model->serviceInput = $map['service_input'];
        }
        if (isset($map['service_output'])) {
            $model->serviceOutput = $map['service_output'];
        }
        if (isset($map['service_type'])) {
            $model->serviceType = $map['service_type'];
        }
        if (isset($map['biz_code'])) {
            $model->bizCode = $map['biz_code'];
        }

        return $model;
    }
}
