<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MYCHARITY\Models;

use AlibabaCloud\Tea\Model;

class InitOrgRequest extends Model
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

    // id
    /**
     * @var string
     */
    public $id;

    // 机构名称
    /**
     * @var string
     */
    public $name;

    // 机构简介
    /**
     * @var string
     */
    public $introduction;

    // 18位社会统一信用代码
    /**
     * @var string
     */
    public $unifiedSocialCreditCode;

    // 测试机构说明:0正式机构(默认),1测试机构
    /**
     * @var string
     */
    public $testFlag;

    // 13位时间戳 签约时间
    /**
     * @var string
     */
    public $signTime;
    protected $_name = [
        'authToken'               => 'auth_token',
        'productInstanceId'       => 'product_instance_id',
        'id'                      => 'id',
        'name'                    => 'name',
        'introduction'            => 'introduction',
        'unifiedSocialCreditCode' => 'unified_social_credit_code',
        'testFlag'                => 'test_flag',
        'signTime'                => 'sign_time',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('introduction', $this->introduction, true);
        Model::validateRequired('unifiedSocialCreditCode', $this->unifiedSocialCreditCode, true);
        Model::validateRequired('signTime', $this->signTime, true);
        Model::validateMaxLength('id', $this->id, 50);
        Model::validateMaxLength('name', $this->name, 50);
        Model::validateMaxLength('introduction', $this->introduction, 500);
        Model::validateMaxLength('unifiedSocialCreditCode', $this->unifiedSocialCreditCode, 18);
        Model::validateMaxLength('testFlag', $this->testFlag, 1);
        Model::validateMaxLength('signTime', $this->signTime, 13);
        Model::validateMinLength('unifiedSocialCreditCode', $this->unifiedSocialCreditCode, 18);
        Model::validateMinLength('testFlag', $this->testFlag, 1);
        Model::validateMinLength('signTime', $this->signTime, 13);
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
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->introduction) {
            $res['introduction'] = $this->introduction;
        }
        if (null !== $this->unifiedSocialCreditCode) {
            $res['unified_social_credit_code'] = $this->unifiedSocialCreditCode;
        }
        if (null !== $this->testFlag) {
            $res['test_flag'] = $this->testFlag;
        }
        if (null !== $this->signTime) {
            $res['sign_time'] = $this->signTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InitOrgRequest
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
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['introduction'])) {
            $model->introduction = $map['introduction'];
        }
        if (isset($map['unified_social_credit_code'])) {
            $model->unifiedSocialCreditCode = $map['unified_social_credit_code'];
        }
        if (isset($map['test_flag'])) {
            $model->testFlag = $map['test_flag'];
        }
        if (isset($map['sign_time'])) {
            $model->signTime = $map['sign_time'];
        }

        return $model;
    }
}
