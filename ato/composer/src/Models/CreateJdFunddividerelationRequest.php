<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class CreateJdFunddividerelationRequest extends Model
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

    // 被分账方商户公司社会统一信用代码
    /**
     * @var string
     */
    public $subjectMerchantId;

    // 分账方租户8位id
    /**
     * @var string
     */
    public $devideTenantId;

    // 分账公司社会信用代码
    /**
     * @var string
     */
    public $devideMerchantId;

    // 分账合同或协议
    /**
     * @var FileInfo[]
     */
    public $contractFiles;

    // 分账关系说明
    /**
     * @var string
     */
    public $desc;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'subjectMerchantId' => 'subject_merchant_id',
        'devideTenantId'    => 'devide_tenant_id',
        'devideMerchantId'  => 'devide_merchant_id',
        'contractFiles'     => 'contract_files',
        'desc'              => 'desc',
    ];

    public function validate()
    {
        Model::validateRequired('subjectMerchantId', $this->subjectMerchantId, true);
        Model::validateRequired('devideTenantId', $this->devideTenantId, true);
        Model::validateRequired('devideMerchantId', $this->devideMerchantId, true);
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
        if (null !== $this->subjectMerchantId) {
            $res['subject_merchant_id'] = $this->subjectMerchantId;
        }
        if (null !== $this->devideTenantId) {
            $res['devide_tenant_id'] = $this->devideTenantId;
        }
        if (null !== $this->devideMerchantId) {
            $res['devide_merchant_id'] = $this->devideMerchantId;
        }
        if (null !== $this->contractFiles) {
            $res['contract_files'] = [];
            if (null !== $this->contractFiles && \is_array($this->contractFiles)) {
                $n = 0;
                foreach ($this->contractFiles as $item) {
                    $res['contract_files'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->desc) {
            $res['desc'] = $this->desc;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateJdFunddividerelationRequest
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
        if (isset($map['subject_merchant_id'])) {
            $model->subjectMerchantId = $map['subject_merchant_id'];
        }
        if (isset($map['devide_tenant_id'])) {
            $model->devideTenantId = $map['devide_tenant_id'];
        }
        if (isset($map['devide_merchant_id'])) {
            $model->devideMerchantId = $map['devide_merchant_id'];
        }
        if (isset($map['contract_files'])) {
            if (!empty($map['contract_files'])) {
                $model->contractFiles = [];
                $n                    = 0;
                foreach ($map['contract_files'] as $item) {
                    $model->contractFiles[$n++] = null !== $item ? FileInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['desc'])) {
            $model->desc = $map['desc'];
        }

        return $model;
    }
}
