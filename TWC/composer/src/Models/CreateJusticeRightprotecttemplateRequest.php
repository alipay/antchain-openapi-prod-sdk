<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateJusticeRightprotecttemplateRequest extends Model
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

    // 维权要素模板名称
    /**
     * @var string
     */
    public $name;

    // 维权要素模板业务类型
    /**
     * @var string
     */
    public $bizType;

    // 维权措施，枚举值，包括：
    // ARBITRATION，仲裁
    // ARBITRATION_EXECUTION，仲裁执行
    // MEDIATION，调解
    /**
     * @var string
     */
    public $rightProtectType;

    // 要素模板关联的案件要素模板ID，要素模板和案件模板必须属于同一个业务类型才可以关联
    /**
     * @var string
     */
    public $caseTemplateId;

    // 维权要素模板文件下载地址，文件为excel格式，包含维权要素的所有算法信息、字段信息和文件附件信息
    /**
     * @var string
     */
    public $templateFileUrl;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'name'              => 'name',
        'bizType'           => 'biz_type',
        'rightProtectType'  => 'right_protect_type',
        'caseTemplateId'    => 'case_template_id',
        'templateFileUrl'   => 'template_file_url',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('bizType', $this->bizType, true);
        Model::validateRequired('rightProtectType', $this->rightProtectType, true);
        Model::validateRequired('caseTemplateId', $this->caseTemplateId, true);
        Model::validateRequired('templateFileUrl', $this->templateFileUrl, true);
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
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->rightProtectType) {
            $res['right_protect_type'] = $this->rightProtectType;
        }
        if (null !== $this->caseTemplateId) {
            $res['case_template_id'] = $this->caseTemplateId;
        }
        if (null !== $this->templateFileUrl) {
            $res['template_file_url'] = $this->templateFileUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateJusticeRightprotecttemplateRequest
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
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['right_protect_type'])) {
            $model->rightProtectType = $map['right_protect_type'];
        }
        if (isset($map['case_template_id'])) {
            $model->caseTemplateId = $map['case_template_id'];
        }
        if (isset($map['template_file_url'])) {
            $model->templateFileUrl = $map['template_file_url'];
        }

        return $model;
    }
}
