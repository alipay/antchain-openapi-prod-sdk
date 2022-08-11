<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_20ab7e4471e24e8fbfaa7df4ba0613c8\Models;

use AlibabaCloud\Tea\Model;

class StartBaasDidCorporateSelfcreateRequest extends Model
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

    // 扩展信息
    /**
     * @var string
     */
    public $extension;

    // 公司名称
    /**
     * @var string
     */
    public $ownerName;

    // 携带自己定义的服务类型
    /**
     * @var DidDocServicesInfo[]
     */
    public $services;

    // 场景码，找dis工作人员进行分配
    /**
     * @var string
     */
    public $bizCode;

    // 生成的did字符串
    /**
     * @var string
     */
    public $did;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'extension'         => 'extension',
        'ownerName'         => 'owner_name',
        'services'          => 'services',
        'bizCode'           => 'biz_code',
        'did'               => 'did',
    ];

    public function validate()
    {
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
        if (null !== $this->extension) {
            $res['extension'] = $this->extension;
        }
        if (null !== $this->ownerName) {
            $res['owner_name'] = $this->ownerName;
        }
        if (null !== $this->services) {
            $res['services'] = [];
            if (null !== $this->services && \is_array($this->services)) {
                $n = 0;
                foreach ($this->services as $item) {
                    $res['services'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->bizCode) {
            $res['biz_code'] = $this->bizCode;
        }
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartBaasDidCorporateSelfcreateRequest
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
        if (isset($map['extension'])) {
            $model->extension = $map['extension'];
        }
        if (isset($map['owner_name'])) {
            $model->ownerName = $map['owner_name'];
        }
        if (isset($map['services'])) {
            if (!empty($map['services'])) {
                $model->services = [];
                $n               = 0;
                foreach ($map['services'] as $item) {
                    $model->services[$n++] = null !== $item ? DidDocServicesInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['biz_code'])) {
            $model->bizCode = $map['biz_code'];
        }
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }

        return $model;
    }
}
