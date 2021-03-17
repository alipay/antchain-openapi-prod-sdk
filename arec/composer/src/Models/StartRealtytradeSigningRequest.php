<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AREC\Models;

use AlibabaCloud\Tea\Model;

class StartRealtytradeSigningRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // 机构账号 ID
    /**
     * @var string
     */
    public $orgId;

    // 业务描述,描述本次合同文档加载业务
    /**
     * @var string
     */
    public $description;

    // 合同及签署信息列表
    /**
     * @var ContractSigning[]
     */
    public $contractList;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orgId'             => 'org_id',
        'description'       => 'description',
        'contractList'      => 'contract_list',
    ];

    public function validate()
    {
        Model::validateRequired('orgId', $this->orgId, true);
        Model::validateRequired('description', $this->description, true);
        Model::validateRequired('contractList', $this->contractList, true);
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
        if (null !== $this->orgId) {
            $res['org_id'] = $this->orgId;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->contractList) {
            $res['contract_list'] = [];
            if (null !== $this->contractList && \is_array($this->contractList)) {
                $n = 0;
                foreach ($this->contractList as $item) {
                    $res['contract_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartRealtytradeSigningRequest
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
        if (isset($map['org_id'])) {
            $model->orgId = $map['org_id'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['contract_list'])) {
            if (!empty($map['contract_list'])) {
                $model->contractList = [];
                $n                   = 0;
                foreach ($map['contract_list'] as $item) {
                    $model->contractList[$n++] = null !== $item ? ContractSigning::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
