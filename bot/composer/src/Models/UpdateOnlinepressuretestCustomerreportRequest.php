<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class UpdateOnlinepressuretestCustomerreportRequest extends Model
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

    // 联调项目ID
    /**
     * @var string
     */
    public $projectId;

    // 客户侧的压测报告
    /**
     * @var string
     */
    public $customerPtReport;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'projectId'         => 'project_id',
        'customerPtReport'  => 'customer_pt_report',
    ];

    public function validate()
    {
        Model::validateRequired('projectId', $this->projectId, true);
        Model::validateRequired('customerPtReport', $this->customerPtReport, true);
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
        if (null !== $this->projectId) {
            $res['project_id'] = $this->projectId;
        }
        if (null !== $this->customerPtReport) {
            $res['customer_pt_report'] = $this->customerPtReport;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateOnlinepressuretestCustomerreportRequest
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
        if (isset($map['project_id'])) {
            $model->projectId = $map['project_id'];
        }
        if (isset($map['customer_pt_report'])) {
            $model->customerPtReport = $map['customer_pt_report'];
        }

        return $model;
    }
}
