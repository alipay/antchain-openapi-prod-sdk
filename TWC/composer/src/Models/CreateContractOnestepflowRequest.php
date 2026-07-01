<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

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
    /**
     * @var bool
     */
    public $autoArchive;

    // 是否自动开启，默认false。
    /**
     * @var bool
     */
    public $autoInitiate;

    // 文件主题
    /**
     * @var string
     */
    public $businessScene;

    // 流程备注
    /**
     * @var string
     */
    public $comment;

    // 任务配置信息
    /**
     * @var ContractSignFlowConfig
     */
    public $contractSignFlowConfig;

    // 待签文档信息
    /**
     * @var ContractDoc[]
     */
    public $docs;

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

    // 流程中的签署区信息
    /**
     * @var OneStepSignField[]
     */
    public $signFields;

    // 签署平台，ALIPAY（支付宝小程序）或H5，默认H5
    /**
     * @var string
     */
    public $signPlatform;

    // 签署有效截止日期，毫秒，默认3天失效
    /**
     * @var int
     */
    public $signValidity;

    // 是否合并签署，默认不是（false）
    /**
     * @var bool
     */
    public $combineSignModel;

    // 合并签署是否开启人脸识别(默认true-开启),非合并签署无需设值
    //
    /**
     * @var bool
     */
    public $needFace;

    // 0-手绘签名
    // 1-模板印章签名
    // 多种类型时逗号分割，为空不限制
    /**
     * @var string
     */
    public $sealType;
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
        'combineSignModel'             => 'combine_sign_model',
        'needFace'                     => 'need_face',
        'sealType'                     => 'seal_type',
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
        if (null !== $this->combineSignModel) {
            $res['combine_sign_model'] = $this->combineSignModel;
        }
        if (null !== $this->needFace) {
            $res['need_face'] = $this->needFace;
        }
        if (null !== $this->sealType) {
            $res['seal_type'] = $this->sealType;
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
            $model->contractSignFlowConfig = ContractSignFlowConfig::fromMap($map['contract_sign_flow_config']);
        }
        if (isset($map['docs'])) {
            if (!empty($map['docs'])) {
                $model->docs = [];
                $n           = 0;
                foreach ($map['docs'] as $item) {
                    $model->docs[$n++] = null !== $item ? ContractDoc::fromMap($item) : $item;
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
        if (isset($map['combine_sign_model'])) {
            $model->combineSignModel = $map['combine_sign_model'];
        }
        if (isset($map['need_face'])) {
            $model->needFace = $map['need_face'];
        }
        if (isset($map['seal_type'])) {
            $model->sealType = $map['seal_type'];
        }

        return $model;
    }
}
