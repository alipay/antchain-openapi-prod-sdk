<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CreateAuthCorporateDidRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // 对企业描述的扩展字段，用于传递更多企业信息，支持业务。
    /**
     * @var string
     */
    public $extensionInfo;

    // 企业名称，通常为法定的公司实体名称
    /**
     * @var string
     */
    public $ownerName;

    // 调用方体系内企业的唯一ID，作为创建DID的绑定目标，调用者需要保证其唯一性。
    /**
     * @var string
     */
    public $ownerUid;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'extensionInfo'     => 'extension_info',
        'ownerName'         => 'owner_name',
        'ownerUid'          => 'owner_uid',
    ];

    public function validate()
    {
        Model::validateRequired('ownerName', $this->ownerName, true);
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
        if (null !== $this->ownerName) {
            $res['owner_name'] = $this->ownerName;
        }
        if (null !== $this->ownerUid) {
            $res['owner_uid'] = $this->ownerUid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateAuthCorporateDidRequest
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
        if (isset($map['owner_name'])) {
            $model->ownerName = $map['owner_name'];
        }
        if (isset($map['owner_uid'])) {
            $model->ownerUid = $map['owner_uid'];
        }

        return $model;
    }
}
