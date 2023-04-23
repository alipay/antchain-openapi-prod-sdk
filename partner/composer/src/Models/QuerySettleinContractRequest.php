<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PARTNER\Models;

use AlibabaCloud\Tea\Model;

class QuerySettleinContractRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 租户来源-用户租户间功能和数据隔离
    /**
     * @var string
     */
    public $source;

    // 一级合作类型
    /**
     * @var string
     */
    public $l1PartnerType;

    // 二级合作类型
    /**
     * @var string
     */
    public $l2PartnerType;

    // 伙伴标准合同查询扩展选项
    /**
     * @var PartnerStandardContractQueryOption
     */
    public $option;

    // 合同渲染上下文，jsonString格式，key值需要提前约定好
    /**
     * @var string
     */
    public $renderContext;
    protected $_name = [
        'authToken'     => 'auth_token',
        'source'        => 'source',
        'l1PartnerType' => 'l1_partner_type',
        'l2PartnerType' => 'l2_partner_type',
        'option'        => 'option',
        'renderContext' => 'render_context',
    ];

    public function validate()
    {
        Model::validateRequired('source', $this->source, true);
        Model::validateRequired('l1PartnerType', $this->l1PartnerType, true);
        Model::validateRequired('l2PartnerType', $this->l2PartnerType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->l1PartnerType) {
            $res['l1_partner_type'] = $this->l1PartnerType;
        }
        if (null !== $this->l2PartnerType) {
            $res['l2_partner_type'] = $this->l2PartnerType;
        }
        if (null !== $this->option) {
            $res['option'] = null !== $this->option ? $this->option->toMap() : null;
        }
        if (null !== $this->renderContext) {
            $res['render_context'] = $this->renderContext;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QuerySettleinContractRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }
        if (isset($map['l1_partner_type'])) {
            $model->l1PartnerType = $map['l1_partner_type'];
        }
        if (isset($map['l2_partner_type'])) {
            $model->l2PartnerType = $map['l2_partner_type'];
        }
        if (isset($map['option'])) {
            $model->option = PartnerStandardContractQueryOption::fromMap($map['option']);
        }
        if (isset($map['render_context'])) {
            $model->renderContext = $map['render_context'];
        }

        return $model;
    }
}
