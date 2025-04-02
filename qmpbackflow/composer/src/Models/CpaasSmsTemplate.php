<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class CpaasSmsTemplate extends Model
{
    // 模板类型
    /**
     * @example SMS_NOTIFICATION
     *
     * @var string
     */
    public $templateType;

    // 模板名称
    /**
     * @example 扩展码测试
     *
     * @var string
     */
    public $templateName;

    // 模板内容
    /**
     * @example 扩展码测试
     *
     * @var string
     */
    public $templateContent;

    // 审批状态
    /**
     * @example APPROVED
     *
     * @var string
     */
    public $status;

    // 模版code
    /**
     * @example SMS_2306XXXX
     *
     * @var string
     */
    public $templateCode;

    // 审核未通过原因
    /**
     * @example 失败原因
     *
     * @var string
     */
    public $failReason;

    // 短信创建时间
    /**
     * @example 短信创建时间
     *
     * @var string
     */
    public $createTime;
    protected $_name = [
        'templateType'    => 'template_type',
        'templateName'    => 'template_name',
        'templateContent' => 'template_content',
        'status'          => 'status',
        'templateCode'    => 'template_code',
        'failReason'      => 'fail_reason',
        'createTime'      => 'create_time',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->templateType) {
            $res['template_type'] = $this->templateType;
        }
        if (null !== $this->templateName) {
            $res['template_name'] = $this->templateName;
        }
        if (null !== $this->templateContent) {
            $res['template_content'] = $this->templateContent;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->templateCode) {
            $res['template_code'] = $this->templateCode;
        }
        if (null !== $this->failReason) {
            $res['fail_reason'] = $this->failReason;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CpaasSmsTemplate
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['template_type'])) {
            $model->templateType = $map['template_type'];
        }
        if (isset($map['template_name'])) {
            $model->templateName = $map['template_name'];
        }
        if (isset($map['template_content'])) {
            $model->templateContent = $map['template_content'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['template_code'])) {
            $model->templateCode = $map['template_code'];
        }
        if (isset($map['fail_reason'])) {
            $model->failReason = $map['fail_reason'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }

        return $model;
    }
}
