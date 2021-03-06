<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class StartDidCorporateAgentcreatewithsidekeyRequest extends Model
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

    // {
    // "自定义服务相关字段": 自定义字符串,
    // "nation": "CN",
    // "type": "LimitedCompany",
    // "name": "演示用户名",
    // "licenceNo": "1111",
    // "address": "1111",
    // "parentName": "演示直连公司",
    // "linkType": "indirect",
    // "certifyDate": "2019-1-1",
    // "licenceExpireDate": "2020-1-1",
    // "businessScope": "1111",
    // "businessAddress": "1111",
    // "corporateBusinessType": 0
    // }
    /**
     * @var string
     */
    public $extensionInfo;

    // 所有需要关联的外键，外键必须已did auth key controller的did作为前缀+“sidekey:”+外键
    /**
     * @var string[]
     */
    public $indexs;

    // 企业名称
    /**
     * @var string
     */
    public $ownerName;

    // 自定义企业唯一id，企业在自有模式下的唯一号bid的has...
    /**
     * @var string
     */
    public $ownerUid;

    // 场景码，找dis工作人员进行分配
    /**
     * @var string
     */
    public $bizCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'extensionInfo'     => 'extension_info',
        'indexs'            => 'indexs',
        'ownerName'         => 'owner_name',
        'ownerUid'          => 'owner_uid',
        'bizCode'           => 'biz_code',
    ];

    public function validate()
    {
        Model::validateRequired('indexs', $this->indexs, true);
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
        if (null !== $this->bizCode) {
            $res['biz_code'] = $this->bizCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartDidCorporateAgentcreatewithsidekeyRequest
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
        if (isset($map['biz_code'])) {
            $model->bizCode = $map['biz_code'];
        }

        return $model;
    }
}
