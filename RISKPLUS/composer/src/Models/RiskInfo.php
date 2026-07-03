<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class RiskInfo extends Model
{
    // 反欺诈风险数据服务风险组描述
    /**
     * @example 贷款车辆存在异常关联记录
     *
     * @var string
     */
    public $riskGroupDesc;

    // 反欺诈风险数据服务风险组名
    /**
     * @example 存在异常关联
     *
     * @var string
     */
    public $riskGroup;

    // 反欺诈风险数据服务风险组类别
    /**
     * @example 车辆风险
     *
     * @var string
     */
    public $riskGroupCategory;

    // 反欺诈风险数据服务风险组信息
    /**
     * @example
     *
     * @var RiskDetail[]
     */
    public $riskDetails;
    protected $_name = [
        'riskGroupDesc'     => 'risk_group_desc',
        'riskGroup'         => 'risk_group',
        'riskGroupCategory' => 'risk_group_category',
        'riskDetails'       => 'risk_details',
    ];

    public function validate()
    {
        Model::validateRequired('riskGroupDesc', $this->riskGroupDesc, true);
        Model::validateRequired('riskGroup', $this->riskGroup, true);
        Model::validateRequired('riskGroupCategory', $this->riskGroupCategory, true);
        Model::validateRequired('riskDetails', $this->riskDetails, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->riskGroupDesc) {
            $res['risk_group_desc'] = $this->riskGroupDesc;
        }
        if (null !== $this->riskGroup) {
            $res['risk_group'] = $this->riskGroup;
        }
        if (null !== $this->riskGroupCategory) {
            $res['risk_group_category'] = $this->riskGroupCategory;
        }
        if (null !== $this->riskDetails) {
            $res['risk_details'] = [];
            if (null !== $this->riskDetails && \is_array($this->riskDetails)) {
                $n = 0;
                foreach ($this->riskDetails as $item) {
                    $res['risk_details'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RiskInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['risk_group_desc'])) {
            $model->riskGroupDesc = $map['risk_group_desc'];
        }
        if (isset($map['risk_group'])) {
            $model->riskGroup = $map['risk_group'];
        }
        if (isset($map['risk_group_category'])) {
            $model->riskGroupCategory = $map['risk_group_category'];
        }
        if (isset($map['risk_details'])) {
            if (!empty($map['risk_details'])) {
                $model->riskDetails = [];
                $n                  = 0;
                foreach ($map['risk_details'] as $item) {
                    $model->riskDetails[$n++] = null !== $item ? RiskDetail::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
