<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateContractHandsignflowRequest extends Model
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

    // 是否自动归档，默认false。如设置为true，当所有签署人签署完毕，系统自动将流程归档，状态变为“已完成”状态，在流程状态为“已完成”前，可随时添加签署人；如设置为false，则在调用签署流程开启后，需主动调用签署流程归档接口，将流程状态变更为“已完成”，归档前可随时添加签署人；已完成的流程才可下载签署后的文件。
    /**
     * @var bool
     */
    public $autoArchive;

    // 文件主题
    /**
     * @var string
     */
    public $businessScene;

    // 任务配置信息
    /**
     * @var ContractSignFlowConfig
     */
    public $configInfo;

    // 文件到期前，提前多久回调提醒续签，单位为小时，时间区间：1小时——15天（360小时），默认不提醒
    /**
     * @var int
     */
    public $contractRemind;

    // 文件有效截止日期,毫秒，默认不失效
    /**
     * @var int
     */
    public $contractValidity;

    // 发起人账户id，即发起本次签署的操作人个人账号id；如不传，默认由对接平台发起
    /**
     * @var string
     */
    public $initiatorAccountId;

    // 发起方主体id，如存在个人代机构发起签约，则需传入机构id；如不传，则默认是对接平台
    /**
     * @var string
     */
    public $initiatorAuthorizedAccountId;

    // 签署有效截止日期,毫秒，默认不失效
    /**
     * @var int
     */
    public $signValidity;
    protected $_name = [
        'authToken'                    => 'auth_token',
        'productInstanceId'            => 'product_instance_id',
        'autoArchive'                  => 'auto_archive',
        'businessScene'                => 'business_scene',
        'configInfo'                   => 'config_info',
        'contractRemind'               => 'contract_remind',
        'contractValidity'             => 'contract_validity',
        'initiatorAccountId'           => 'initiator_account_id',
        'initiatorAuthorizedAccountId' => 'initiator_authorized_account_id',
        'signValidity'                 => 'sign_validity',
    ];

    public function validate()
    {
        Model::validateRequired('businessScene', $this->businessScene, true);
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
        if (null !== $this->autoArchive) {
            $res['auto_archive'] = $this->autoArchive;
        }
        if (null !== $this->businessScene) {
            $res['business_scene'] = $this->businessScene;
        }
        if (null !== $this->configInfo) {
            $res['config_info'] = null !== $this->configInfo ? $this->configInfo->toMap() : null;
        }
        if (null !== $this->contractRemind) {
            $res['contract_remind'] = $this->contractRemind;
        }
        if (null !== $this->contractValidity) {
            $res['contract_validity'] = $this->contractValidity;
        }
        if (null !== $this->initiatorAccountId) {
            $res['initiator_account_id'] = $this->initiatorAccountId;
        }
        if (null !== $this->initiatorAuthorizedAccountId) {
            $res['initiator_authorized_account_id'] = $this->initiatorAuthorizedAccountId;
        }
        if (null !== $this->signValidity) {
            $res['sign_validity'] = $this->signValidity;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateContractHandsignflowRequest
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
        if (isset($map['auto_archive'])) {
            $model->autoArchive = $map['auto_archive'];
        }
        if (isset($map['business_scene'])) {
            $model->businessScene = $map['business_scene'];
        }
        if (isset($map['config_info'])) {
            $model->configInfo = ContractSignFlowConfig::fromMap($map['config_info']);
        }
        if (isset($map['contract_remind'])) {
            $model->contractRemind = $map['contract_remind'];
        }
        if (isset($map['contract_validity'])) {
            $model->contractValidity = $map['contract_validity'];
        }
        if (isset($map['initiator_account_id'])) {
            $model->initiatorAccountId = $map['initiator_account_id'];
        }
        if (isset($map['initiator_authorized_account_id'])) {
            $model->initiatorAuthorizedAccountId = $map['initiator_authorized_account_id'];
        }
        if (isset($map['sign_validity'])) {
            $model->signValidity = $map['sign_validity'];
        }

        return $model;
    }
}
