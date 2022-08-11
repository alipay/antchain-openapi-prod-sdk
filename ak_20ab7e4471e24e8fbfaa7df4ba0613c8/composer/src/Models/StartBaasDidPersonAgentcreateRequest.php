<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_20ab7e4471e24e8fbfaa7df4ba0613c8\Models;

use AlibabaCloud\Tea\Model;

class StartBaasDidPersonAgentcreateRequest extends Model
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

    // 企业自定信息
    /**
     * @var string
     */
    public $extensionInfo;

    // 所有需要关联的外键，外键必须已did auth key controller的did作为前缀+“sidekey:”+外键
    /**
     * @var string[]
     */
    public $indexs;

    // 名称
    /**
     * @var string
     */
    public $ownerName;

    // 唯一号，比如可以是hash(证件类型+企业营业执照号) 计算出来的唯一值等
    /**
     * @var string
     */
    public $ownerUid;

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
        'extensionInfo'     => 'extension_info',
        'indexs'            => 'indexs',
        'ownerName'         => 'owner_name',
        'ownerUid'          => 'owner_uid',
        'services'          => 'services',
        'bizCode'           => 'biz_code',
        'did'               => 'did',
    ];

    public function validate()
    {
        Model::validateRequired('ownerUid', $this->ownerUid, true);
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
        if (null !== $this->extensionInfo) {
            $res['extension_info'] = $this->extensionInfo;
        }
        if (null !== $this->indexs) {
            $res['indexs'] = $this->indexs;
        }
        if (null !== $this->ownerName) {
            $res['owner_name'] = $this->ownerName;
        }
        if (null !== $this->ownerUid) {
            $res['owner_uid'] = $this->ownerUid;
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
     * @return StartBaasDidPersonAgentcreateRequest
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
        if (isset($map['extension_info'])) {
            $model->extensionInfo = $map['extension_info'];
        }
        if (isset($map['indexs'])) {
            if (!empty($map['indexs'])) {
                $model->indexs = $map['indexs'];
            }
        }
        if (isset($map['owner_name'])) {
            $model->ownerName = $map['owner_name'];
        }
        if (isset($map['owner_uid'])) {
            $model->ownerUid = $map['owner_uid'];
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
