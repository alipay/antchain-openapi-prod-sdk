<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_d7c024d004594db188cee2346b384a48\Models;

use AlibabaCloud\Tea\Model;

class QueryTemplateStatusResponse extends Model
{
    // 彩信模版id
    /**
     * @example
     *
     * @var string
     */
    public $templateId;

    // 模版名称
    /**
     * @example
     *
     * @var string
     */
    public $templateName;

    // 模板状态
    /**
     * @example
     *
     * @var string
     */
    public $templateStatus;

    // 审核信息
    /**
     * @example
     *
     * @var string
     */
    public $censorResult;
    protected $_name = [
        'templateId'     => 'template_id',
        'templateName'   => 'template_name',
        'templateStatus' => 'template_status',
        'censorResult'   => 'censor_result',
    ];

    public function validate()
    {
        Model::validateRequired('templateId', $this->templateId, true);
        Model::validateRequired('templateName', $this->templateName, true);
        Model::validateRequired('templateStatus', $this->templateStatus, true);
        Model::validateRequired('censorResult', $this->censorResult, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->templateId) {
            $res['template_id'] = $this->templateId;
        }
        if (null !== $this->templateName) {
            $res['template_name'] = $this->templateName;
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
     * @return QueryTemplateStatusResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['template_id'])) {
            $model->templateId = $map['template_id'];
        }
        if (isset($map['template_name'])) {
            $model->templateName = $map['template_name'];
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
