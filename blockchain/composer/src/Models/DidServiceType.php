<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class DidServiceType extends Model
{
    // 枚举类型，描述访问服务的方式
    /**
     * @example http,https,openapi,ftp,other...
     *
     * @var string
     */
    public $accessMode;

    // 对服务的文字描述，<1000个字符
    /**
     * @example 对服务描述
     *
     * @var string
     */
    public $description;

    // 服务类型创建者did
    /**
     * @example did:mychain:xxxx
     *
     * @var string
     */
    public $did;

    // { "item1":"", "item2":"",...
    /**
     * @example json描述服务入参
     *
     * @var string
     */
    public $serviceInput;

    // 返回值类型描述，json形式
    /**
     * @example { "item1":"" "item2":"" ... }
     *
     * @var string
     */
    public $serviceOutput;

    // 自定义服务类型，字符数16～32个
    /**
     * @example KYBServiceType
     *
     * @var string
     */
    public $serviceType;
    protected $_name = [
        'accessMode'    => 'access_mode',
        'description'   => 'description',
        'did'           => 'did',
        'serviceInput'  => 'service_input',
        'serviceOutput' => 'service_output',
        'serviceType'   => 'service_type',
    ];

    public function validate()
    {
        Model::validateMaxLength('description', $this->description, 1000);
        Model::validateRequired('did', $this->did, true);
        Model::validateRequired('serviceType', $this->serviceType, true);
    }

    public function toMap()
    {
        $res = [];
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DidServiceType
     */
    public static function fromMap($map = [])
    {
        $model = new self();
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

        return $model;
    }
}
