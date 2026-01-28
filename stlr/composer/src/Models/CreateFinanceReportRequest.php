<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class CreateFinanceReportRequest extends Model
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

    // 银行碳账户
    /**
     * @var string
     */
    public $enterpriseNo;

    // 企业社会统一信用编码
    /**
     * @var string
     */
    public $companyId;

    // 对比年
    /**
     * @var string
     */
    public $compareYear;

    // 基准年份
    /**
     * @var string
     */
    public $baseYear;

    // 转型路径分析
    /**
     * @var TransferPathAnalysis[]
     */
    public $transferPathAnalysisList;
    protected $_name = [
        'authToken'                => 'auth_token',
        'productInstanceId'        => 'product_instance_id',
        'enterpriseNo'             => 'enterprise_no',
        'companyId'                => 'company_id',
        'compareYear'              => 'compare_year',
        'baseYear'                 => 'base_year',
        'transferPathAnalysisList' => 'transfer_path_analysis_list',
    ];

    public function validate()
    {
        Model::validateRequired('enterpriseNo', $this->enterpriseNo, true);
        Model::validateRequired('companyId', $this->companyId, true);
        Model::validateRequired('compareYear', $this->compareYear, true);
        Model::validateRequired('baseYear', $this->baseYear, true);
        Model::validateRequired('transferPathAnalysisList', $this->transferPathAnalysisList, true);
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
        if (null !== $this->enterpriseNo) {
            $res['enterprise_no'] = $this->enterpriseNo;
        }
        if (null !== $this->companyId) {
            $res['company_id'] = $this->companyId;
        }
        if (null !== $this->compareYear) {
            $res['compare_year'] = $this->compareYear;
        }
        if (null !== $this->baseYear) {
            $res['base_year'] = $this->baseYear;
        }
        if (null !== $this->transferPathAnalysisList) {
            $res['transfer_path_analysis_list'] = [];
            if (null !== $this->transferPathAnalysisList && \is_array($this->transferPathAnalysisList)) {
                $n = 0;
                foreach ($this->transferPathAnalysisList as $item) {
                    $res['transfer_path_analysis_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateFinanceReportRequest
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
        if (isset($map['enterprise_no'])) {
            $model->enterpriseNo = $map['enterprise_no'];
        }
        if (isset($map['company_id'])) {
            $model->companyId = $map['company_id'];
        }
        if (isset($map['compare_year'])) {
            $model->compareYear = $map['compare_year'];
        }
        if (isset($map['base_year'])) {
            $model->baseYear = $map['base_year'];
        }
        if (isset($map['transfer_path_analysis_list'])) {
            if (!empty($map['transfer_path_analysis_list'])) {
                $model->transferPathAnalysisList = [];
                $n                               = 0;
                foreach ($map['transfer_path_analysis_list'] as $item) {
                    $model->transferPathAnalysisList[$n++] = null !== $item ? TransferPathAnalysis::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
