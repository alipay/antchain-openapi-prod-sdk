<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACC\Models;

use AlibabaCloud\Tea\Model;

class CreateContractSignflowRequest extends Model
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

    // 是否自动归档，默认false 如设置为true，则在流程开启后，当所有签署人签署完毕，系统自动将流程归档，状态变为“已完成”状态，在流程状态为“已完成”前，可随时添加签署人；如设置为false，则在调用流程开启后，需主动调用签署流程归档接口，将流程状...
    //
    /**
     * @var bool
     */
    public $autoArchive;

    // 是否强制代扣
    //
    /**
     * @var bool
     */
    public $autoDeductionForce;

    // 文件主题
    //
    /**
     * @var string
     */
    public $businessScene;

    // 合同签名配置
    /**
     * @var Contractsignflowconfig
     */
    public $contractSignFlowConfig;

    // 发起人账户id，即发起本次签署的操作人个人账号id；如不传，默认由对接平台发起
    //
    /**
     * @var string
     */
    public $initiatorAccountId;

    // 发起方主体id，如存在个人代机构发起签约，则需传入机构id；如不传，则默认是对接平台
    //
    /**
     * @var string
     */
    public $initiatorAuthorizedAccountId;

    // 代扣信息
    /**
     * @var ContractPaymentOrderInfo[]
     */
    public $repaymentOrderInfo;

    // 签署平台，ALIPAY（支付宝小程序）或H5
    //
    /**
     * @var string
     */
    public $signPlatform;

    // 签署有效截止日期，毫秒，默认3天失效
    //
    /**
     * @var int
     */
    public $signValidity;

    // 付款方ID（个人）
    //
    /**
     * @var string
     */
    public $payerTuid;

    // 收款方ID(机构)
    //
    /**
     * @var string
     */
    public $payeeTuid;
    protected $_name = [
        'authToken'                    => 'auth_token',
        'productInstanceId'            => 'product_instance_id',
        'autoArchive'                  => 'auto_archive',
        'autoDeductionForce'           => 'auto_deduction_force',
        'businessScene'                => 'business_scene',
        'contractSignFlowConfig'       => 'contract_sign_flow_config',
        'initiatorAccountId'           => 'initiator_account_id',
        'initiatorAuthorizedAccountId' => 'initiator_authorized_account_id',
        'repaymentOrderInfo'           => 'repayment_order_info',
        'signPlatform'                 => 'sign_platform',
        'signValidity'                 => 'sign_validity',
        'payerTuid'                    => 'payer_tuid',
        'payeeTuid'                    => 'payee_tuid',
    ];

    public function validate()
    {
        Model::validateRequired('autoDeductionForce', $this->autoDeductionForce, true);
        Model::validateRequired('businessScene', $this->businessScene, true);
        Model::validateRequired('contractSignFlowConfig', $this->contractSignFlowConfig, true);
        Model::validateRequired('repaymentOrderInfo', $this->repaymentOrderInfo, true);
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
        if (null !== $this->autoDeductionForce) {
            $res['auto_deduction_force'] = $this->autoDeductionForce;
        }
        if (null !== $this->businessScene) {
            $res['business_scene'] = $this->businessScene;
        }
        if (null !== $this->contractSignFlowConfig) {
            $res['contract_sign_flow_config'] = null !== $this->contractSignFlowConfig ? $this->contractSignFlowConfig->toMap() : null;
        }
        if (null !== $this->initiatorAccountId) {
            $res['initiator_account_id'] = $this->initiatorAccountId;
        }
        if (null !== $this->initiatorAuthorizedAccountId) {
            $res['initiator_authorized_account_id'] = $this->initiatorAuthorizedAccountId;
        }
        if (null !== $this->repaymentOrderInfo) {
            $res['repayment_order_info'] = [];
            if (null !== $this->repaymentOrderInfo && \is_array($this->repaymentOrderInfo)) {
                $n = 0;
                foreach ($this->repaymentOrderInfo as $item) {
                    $res['repayment_order_info'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->signPlatform) {
            $res['sign_platform'] = $this->signPlatform;
        }
        if (null !== $this->signValidity) {
            $res['sign_validity'] = $this->signValidity;
        }
        if (null !== $this->payerTuid) {
            $res['payer_tuid'] = $this->payerTuid;
        }
        if (null !== $this->payeeTuid) {
            $res['payee_tuid'] = $this->payeeTuid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateContractSignflowRequest
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
        if (isset($map['auto_deduction_force'])) {
            $model->autoDeductionForce = $map['auto_deduction_force'];
        }
        if (isset($map['business_scene'])) {
            $model->businessScene = $map['business_scene'];
        }
        if (isset($map['contract_sign_flow_config'])) {
            $model->contractSignFlowConfig = Contractsignflowconfig::fromMap($map['contract_sign_flow_config']);
        }
        if (isset($map['initiator_account_id'])) {
            $model->initiatorAccountId = $map['initiator_account_id'];
        }
        if (isset($map['initiator_authorized_account_id'])) {
            $model->initiatorAuthorizedAccountId = $map['initiator_authorized_account_id'];
        }
        if (isset($map['repayment_order_info'])) {
            if (!empty($map['repayment_order_info'])) {
                $model->repaymentOrderInfo = [];
                $n                         = 0;
                foreach ($map['repayment_order_info'] as $item) {
                    $model->repaymentOrderInfo[$n++] = null !== $item ? ContractPaymentOrderInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['sign_platform'])) {
            $model->signPlatform = $map['sign_platform'];
        }
        if (isset($map['sign_validity'])) {
            $model->signValidity = $map['sign_validity'];
        }
        if (isset($map['payer_tuid'])) {
            $model->payerTuid = $map['payer_tuid'];
        }
        if (isset($map['payee_tuid'])) {
            $model->payeeTuid = $map['payee_tuid'];
        }

        return $model;
    }
}
