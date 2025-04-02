<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class CustomerUmktInfoModel extends Model
{
    // 基本圈客结果信息
    /**
     * @example
     *
     * @var BaseCustomerUmktInfoModel
     */
    public $baseInfo;

    // 额外的营销分结果
    /**
     * @example {"f_01":"95.0"}
     *
     * @var string
     */
    public $umktOutPutInfo;
    protected $_name = [
        'baseInfo'       => 'base_info',
        'umktOutPutInfo' => 'umkt_out_put_info',
    ];

    public function validate()
    {
        Model::validateRequired('baseInfo', $this->baseInfo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->baseInfo) {
            $res['base_info'] = null !== $this->baseInfo ? $this->baseInfo->toMap() : null;
        }
        if (null !== $this->umktOutPutInfo) {
            $res['umkt_out_put_info'] = $this->umktOutPutInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CustomerUmktInfoModel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['base_info'])) {
            $model->baseInfo = BaseCustomerUmktInfoModel::fromMap($map['base_info']);
        }
        if (isset($map['umkt_out_put_info'])) {
            $model->umktOutPutInfo = $map['umkt_out_put_info'];
        }

        return $model;
    }
}
