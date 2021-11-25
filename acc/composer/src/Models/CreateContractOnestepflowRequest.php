<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACC\Models;

use AlibabaCloud\Tea\Model;

class CreateContractOnestepflowRequest extends Model
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

    // 是否自动归档，默认false。
    //
    /**
     * @var bool
     */
    public $autoArchive;

    // 是否自动开启，默认false。
    //
    /**
     * @var bool
     */
    public $autoInitiate;

    // 文件主题
    //
    /**
     * @var string
     */
    public $businessScene;

    // 流程备注
    //
    /**
     * @var string
     */
    public $comment;

    // 流程配置
    /**
     * @var Contractsignflowconfig
     */
    public $contractSignFlowConfig;

    // 合同文件
    /**
     * @var ContractDocument[]
     */
    public $docs;

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

    // 签署操作人个人账号标识，即操作本次签署的个人
    //
    /**
     * @var OneStepSignField[]
     */
    public $signFields;

    // 签署平台，ALIPAY（支付宝小程序）或H5，默认H5
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
    protected $_name = [
        'authToken'                    => 'auth_token',
        'productInstanceId'            => 'product_instance_id',
        'autoArchive'                  => 'auto_archive',
        'autoInitiate'                 => 'auto_initiate',
        'businessScene'                => 'business_scene',
        'comment'                      => 'comment',
        'contractSignFlowConfig'       => 'contract_sign_flow_config',
        'docs'                         => 'docs',
        'initiatorAccountId'           => 'initiator_account_id',
        'initiatorAuthorizedAccountId' => 'initiator_authorized_account_id',
        'signFields'                   => 'sign_fields',
        'signPlatform'                 => 'sign_platform',
        'signValidity'                 => 'sign_validity',
    ];

    public function validate()
    {
        Model::validateRequired('businessScene', $this->businessScene, true);
        Model::validateRequired('contractSignFlowConfig', $this->contractSignFlowConfig, true);
        Model::validateRequired('docs', $this->docs, true);
        Model::validateRequired('signFields', $this->signFields, true);
        Model::validateRequired('signValidity', $this->signValidity, true);
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
        if (null !== $this->autoInitiate) {
            $res['auto_initiate'] = $this->autoInitiate;
        }
        if (null !== $this->businessScene) {
            $res['business_scene'] = $this->businessScene;
        }
        if (null !== $this->comment) {
            $res['comment'] = $this->comment;
        }
        if (null !== $this->contractSignFlowConfig) {
            $res['contract_sign_flow_config'] = null !== $this->contractSignFlowConfig ? $this->contractSignFlowConfig->toMap() : null;
        }
        if (null !== $this->docs) {
            $res['docs'] = [];
            if (null !== $this->docs && \is_array($this->docs)) {
                $n = 0;
                foreach ($this->docs as $item) {
                    $res['docs'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->initiatorAccountId) {
            $res['initiator_account_id'] = $this->initiatorAccountId;
        }
        if (null !== $this->initiatorAuthorizedAccountId) {
            $res['initiator_authorized_account_id'] = $this->initiatorAuthorizedAccountId;
        }
        if (null !== $this->signFields) {
            $res['sign_fields'] = [];
            if (null !== $this->signFields && \is_array($this->signFields)) {
                $n = 0;
                foreach ($this->signFields as $item) {
                    $res['sign_fields'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->signPlatform) {
            $res['sign_platform'] = $this->signPlatform;
        }
        if (null !== $this->signValidity) {
            $res['sign_validity'] = $this->signValidity;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateContractOnestepflowRequest
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
        if (isset($map['auto_initiate'])) {
            $model->autoInitiate = $map['auto_initiate'];
        }
        if (isset($map['business_scene'])) {
            $model->businessScene = $map['business_scene'];
        }
        if (isset($map['comment'])) {
            $model->comment = $map['comment'];
        }
        if (isset($map['contract_sign_flow_config'])) {
            $model->contractSignFlowConfig = Contractsignflowconfig::fromMap($map['contract_sign_flow_config']);
        }
        if (isset($map['docs'])) {
            if (!empty($map['docs'])) {
                $model->docs = [];
                $n           = 0;
                foreach ($map['docs'] as $item) {
                    $model->docs[$n++] = null !== $item ? ContractDocument::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['initiator_account_id'])) {
            $model->initiatorAccountId = $map['initiator_account_id'];
        }
        if (isset($map['initiator_authorized_account_id'])) {
            $model->initiatorAuthorizedAccountId = $map['initiator_authorized_account_id'];
        }
        if (isset($map['sign_fields'])) {
            if (!empty($map['sign_fields'])) {
                $model->signFields = [];
                $n                 = 0;
                foreach ($map['sign_fields'] as $item) {
                    $model->signFields[$n++] = null !== $item ? OneStepSignField::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['sign_platform'])) {
            $model->signPlatform = $map['sign_platform'];
        }
        if (isset($map['sign_validity'])) {
            $model->signValidity = $map['sign_validity'];
        }

        return $model;
    }
}
