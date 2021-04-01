<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CreateDidPersonWithfourmetaRequest extends Model
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

    // 银行卡号
    /**
     * @var string
     */
    public $bankCard;

    // 身份证号码
    //
    /**
     * @var string
     */
    public $certNo;

    // 扩展字段
    //
    /**
     * @var string
     */
    public $extensionInfo;

    // 手机号码
    //
    /**
     * @var string
     */
    public $mobile;

    // 姓名
    //
    /**
     * @var string
     */
    public $name;

    // 名称
    //
    /**
     * @var string
     */
    public $ownerName;

    // 自定义个人唯一id，个人在自有模式下的唯一号，调用者需要保证其唯一性
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
        'bankCard'          => 'bank_card',
        'certNo'            => 'cert_no',
        'extensionInfo'     => 'extension_info',
        'mobile'            => 'mobile',
        'name'              => 'name',
        'ownerName'         => 'owner_name',
        'ownerUid'          => 'owner_uid',
        'bizCode'           => 'biz_code',
    ];

    public function validate()
    {
        Model::validateRequired('bankCard', $this->bankCard, true);
        Model::validateRequired('certNo', $this->certNo, true);
        Model::validateRequired('mobile', $this->mobile, true);
        Model::validateRequired('name', $this->name, true);
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
        if (null !== $this->bankCard) {
            $res['bank_card'] = $this->bankCard;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->extensionInfo) {
            $res['extension_info'] = $this->extensionInfo;
        }
        if (null !== $this->mobile) {
            $res['mobile'] = $this->mobile;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
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
     * @return CreateDidPersonWithfourmetaRequest
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
        if (isset($map['bank_card'])) {
            $model->bankCard = $map['bank_card'];
        }
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['extension_info'])) {
            $model->extensionInfo = $map['extension_info'];
        }
        if (isset($map['mobile'])) {
            $model->mobile = $map['mobile'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
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
