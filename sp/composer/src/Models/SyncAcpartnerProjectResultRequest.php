<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SP\Models;

use AlibabaCloud\Tea\Model;

class SyncAcpartnerProjectResultRequest extends Model
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

    /**
     * @var string
     */
    public $productAccessCode;

    // 租户code：用于数据和功能隔离
    /**
     * @var string
     */
    public $source;

    // 项目id
    /**
     * @var int
     */
    public $projectId;

    // 外部业务单据号
    /**
     * @var string
     */
    public $outBusinessNo;

    // 支出配置单结果列表
    /**
     * @var ExpenditureQuotationItemResult[]
     */
    public $expenditureQuotationItems;

    // 结果码
    /**
     * @var string
     */
    public $code;
    protected $_name = [
        'authToken'                 => 'auth_token',
        'productInstanceId'         => 'product_instance_id',
        'productAccessCode'         => 'product_access_code',
        'source'                    => 'source',
        'projectId'                 => 'project_id',
        'outBusinessNo'             => 'out_business_no',
        'expenditureQuotationItems' => 'expenditure_quotation_items',
        'code'                      => 'code',
    ];

    public function validate()
    {
        Model::validateRequired('source', $this->source, true);
        Model::validateRequired('projectId', $this->projectId, true);
        Model::validateRequired('outBusinessNo', $this->outBusinessNo, true);
        Model::validateRequired('expenditureQuotationItems', $this->expenditureQuotationItems, true);
        Model::validateRequired('code', $this->code, true);
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
        if (null !== $this->productAccessCode) {
            $res['product_access_code'] = $this->productAccessCode;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->projectId) {
            $res['project_id'] = $this->projectId;
        }
        if (null !== $this->outBusinessNo) {
            $res['out_business_no'] = $this->outBusinessNo;
        }
        if (null !== $this->expenditureQuotationItems) {
            $res['expenditure_quotation_items'] = [];
            if (null !== $this->expenditureQuotationItems && \is_array($this->expenditureQuotationItems)) {
                $n = 0;
                foreach ($this->expenditureQuotationItems as $item) {
                    $res['expenditure_quotation_items'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SyncAcpartnerProjectResultRequest
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
        if (isset($map['product_access_code'])) {
            $model->productAccessCode = $map['product_access_code'];
        }
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }
        if (isset($map['project_id'])) {
            $model->projectId = $map['project_id'];
        }
        if (isset($map['out_business_no'])) {
            $model->outBusinessNo = $map['out_business_no'];
        }
        if (isset($map['expenditure_quotation_items'])) {
            if (!empty($map['expenditure_quotation_items'])) {
                $model->expenditureQuotationItems = [];
                $n                                = 0;
                foreach ($map['expenditure_quotation_items'] as $item) {
                    $model->expenditureQuotationItems[$n++] = null !== $item ? ExpenditureQuotationItemResult::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }

        return $model;
    }
}
