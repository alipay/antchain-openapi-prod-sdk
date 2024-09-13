<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MEDIA_SMS\Models;

use AlibabaCloud\Tea\Model;

class QueryTemplateStatusRes extends Model
{
    // 短信模板id
    /**
     * @example 202409050005000000019020
     *
     * @var string
     */
    public $templateId;

    // 短信标题
    /**
     * @example  XX活动
     *
     * @var string
     */
    public $smsTitle;

    // 模板状态
    /**
     * @example  CENSOR_ING、 CENSOR_PASS、 CENSOR_FAILED
     *
     * @var string
     */
    public $templateStatus;

    // 审核结果描述
    /**
     * @example
     *
     * @var string
     */
    public $censorResult;
    protected $_name = [
        'templateId'     => 'template_id',
        'smsTitle'       => 'sms_title',
        'templateStatus' => 'template_status',
        'censorResult'   => 'censor_result',
    ];

    public function validate()
    {
        Model::validateRequired('templateId', $this->templateId, true);
        Model::validateRequired('smsTitle', $this->smsTitle, true);
        Model::validateRequired('templateStatus', $this->templateStatus, true);
        Model::validateRequired('censorResult', $this->censorResult, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->templateId) {
            $res['template_id'] = $this->templateId;
        }
        if (null !== $this->smsTitle) {
            $res['sms_title'] = $this->smsTitle;
        }
        if (null !== $this->templateStatus) {
            $res['template_status'] = $this->templateStatus;
        }
        if (null !== $this->censorResult) {
            $res['censor_result'] = $this->censorResult;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryTemplateStatusRes
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['template_id'])) {
            $model->templateId = $map['template_id'];
        }
        if (isset($map['sms_title'])) {
            $model->smsTitle = $map['sms_title'];
        }
        if (isset($map['template_status'])) {
            $model->templateStatus = $map['template_status'];
        }
        if (isset($map['censor_result'])) {
            $model->censorResult = $map['censor_result'];
        }

        return $model;
    }
}
