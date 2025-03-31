<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class SaveInnerAgentcustomerserviceRequest extends Model
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

    // 租户id
    /**
     * @var string
     */
    public $tenantId;

    // 客诉问题
    /**
     * @var string
     */
    public $customerComplaintIssues;

    // 客诉处理人员信息
    /**
     * @var CustomerPersonInfo[]
     */
    public $customerPersonInfoList;
    protected $_name = [
        'authToken'               => 'auth_token',
        'productInstanceId'       => 'product_instance_id',
        'tenantId'                => 'tenant_id',
        'customerComplaintIssues' => 'customer_complaint_issues',
        'customerPersonInfoList'  => 'customer_person_info_list',
    ];

    public function validate()
    {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('customerComplaintIssues', $this->customerComplaintIssues, true);
        Model::validateRequired('customerPersonInfoList', $this->customerPersonInfoList, true);
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
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->customerComplaintIssues) {
            $res['customer_complaint_issues'] = $this->customerComplaintIssues;
        }
        if (null !== $this->customerPersonInfoList) {
            $res['customer_person_info_list'] = [];
            if (null !== $this->customerPersonInfoList && \is_array($this->customerPersonInfoList)) {
                $n = 0;
                foreach ($this->customerPersonInfoList as $item) {
                    $res['customer_person_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SaveInnerAgentcustomerserviceRequest
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
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['customer_complaint_issues'])) {
            $model->customerComplaintIssues = $map['customer_complaint_issues'];
        }
        if (isset($map['customer_person_info_list'])) {
            if (!empty($map['customer_person_info_list'])) {
                $model->customerPersonInfoList = [];
                $n                             = 0;
                foreach ($map['customer_person_info_list'] as $item) {
                    $model->customerPersonInfoList[$n++] = null !== $item ? CustomerPersonInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
