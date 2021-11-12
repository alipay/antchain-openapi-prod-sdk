<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class AutoTestProduct extends Model
{
    // 部署单元id
    /**
     * @example default
     *
     * @var string
     */
    public $deployUnit;

    // 产品码
    /**
     * @example ZOOKEEPER
     *
     * @var string
     */
    public $prodCode;

    // 应用启动参数数据
    /**
     * @example
     *
     * @var AppParamData[]
     */
    public $appParamData;
    protected $_name = [
        'deployUnit'   => 'deploy_unit',
        'prodCode'     => 'prod_code',
        'appParamData' => 'app_param_data',
    ];

    public function validate()
    {
        Model::validateRequired('prodCode', $this->prodCode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->deployUnit) {
            $res['deploy_unit'] = $this->deployUnit;
        }
        if (null !== $this->prodCode) {
            $res['prod_code'] = $this->prodCode;
        }
        if (null !== $this->appParamData) {
            $res['app_param_data'] = [];
            if (null !== $this->appParamData && \is_array($this->appParamData)) {
                $n = 0;
                foreach ($this->appParamData as $item) {
                    $res['app_param_data'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AutoTestProduct
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['deploy_unit'])) {
            $model->deployUnit = $map['deploy_unit'];
        }
        if (isset($map['prod_code'])) {
            $model->prodCode = $map['prod_code'];
        }
        if (isset($map['app_param_data'])) {
            if (!empty($map['app_param_data'])) {
                $model->appParamData = [];
                $n                   = 0;
                foreach ($map['app_param_data'] as $item) {
                    $model->appParamData[$n++] = null !== $item ? AppParamData::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
