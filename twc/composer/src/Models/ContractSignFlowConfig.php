<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class ContractSignFlowConfig extends Model
{
    // 回调通知地址 ,默认取项目配置通知地址
    /**
     * @example http://127.0.0.1:9110/notice
     *
     * @var string
     */
    public $noticeDeveloperUrl;

    // 签署通知和审批通知的通知方式，传 "" 表示不需要通知，传"1"表示短信通知。短信功能需要联系售后开白名单才会生效。
    /**
     * @example 1
     *
     * @var string
     */
    public $noticeType;

    // 签署成功或者流程结束后的默认重定向地址，默认签署完成停在当前页面
    /**
     * @example http://127.0.0.1:8110/h5/forword
     *
     * @var string
     */
    public $redirectUrl;

    // 【该字段已废弃】签署平台，逗号分割，1-开放服务h5，2-支付宝签 ，默认值1
    /**
     * @example 1
     *
     * @var string
     */
    public $signPlatform;

    // 签署失败时的跳转地址，如果不做单独配置，默认与redirect_url一致（配合twc.notary.contract.signflow.create接口使用）
    /**
     * @example http://127.0.0.1:8110/h5/forword/failure
     *
     * @var string
     */
    public $redirectUrlOnFailure;

    // 是否允许自由签署，默认false（配合twc.notary.contract.signflow.create接口使用）
    /**
     * @example true, false
     *
     * @var bool
     */
    public $freeSignature;
    protected $_name = [
        'noticeDeveloperUrl'   => 'notice_developer_url',
        'noticeType'           => 'notice_type',
        'redirectUrl'          => 'redirect_url',
        'signPlatform'         => 'sign_platform',
        'redirectUrlOnFailure' => 'redirect_url_on_failure',
        'freeSignature'        => 'free_signature',
    ];

    public function validate()
    {
        Model::validateRequired('noticeType', $this->noticeType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->noticeDeveloperUrl) {
            $res['notice_developer_url'] = $this->noticeDeveloperUrl;
        }
        if (null !== $this->noticeType) {
            $res['notice_type'] = $this->noticeType;
        }
        if (null !== $this->redirectUrl) {
            $res['redirect_url'] = $this->redirectUrl;
        }
        if (null !== $this->signPlatform) {
            $res['sign_platform'] = $this->signPlatform;
        }
        if (null !== $this->redirectUrlOnFailure) {
            $res['redirect_url_on_failure'] = $this->redirectUrlOnFailure;
        }
        if (null !== $this->freeSignature) {
            $res['free_signature'] = $this->freeSignature;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContractSignFlowConfig
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['notice_developer_url'])) {
            $model->noticeDeveloperUrl = $map['notice_developer_url'];
        }
        if (isset($map['notice_type'])) {
            $model->noticeType = $map['notice_type'];
        }
        if (isset($map['redirect_url'])) {
            $model->redirectUrl = $map['redirect_url'];
        }
        if (isset($map['sign_platform'])) {
            $model->signPlatform = $map['sign_platform'];
        }
        if (isset($map['redirect_url_on_failure'])) {
            $model->redirectUrlOnFailure = $map['redirect_url_on_failure'];
        }
        if (isset($map['free_signature'])) {
            $model->freeSignature = $map['free_signature'];
        }

        return $model;
    }
}
