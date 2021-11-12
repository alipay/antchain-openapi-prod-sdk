<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class AppParamData extends Model
{
    // 产品码
    /**
     * @example YANFA
     *
     * @var string
     */
    public $prodCode;

    // 应用名
    /**
     * @example yanfa
     *
     * @var string
     */
    public $appName;

    // 应用启动参数
    /**
     * @example
     *
     * @var ParamData[]
     */
    public $appParams;
    protected $_name = [
        'prodCode'  => 'prod_code',
        'appName'   => 'app_name',
        'appParams' => 'app_params',
    ];

    public function validate()
    {
        Model::validateRequired('prodCode', $this->prodCode, true);
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('appParams', $this->appParams, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->prodCode) {
            $res['prod_code'] = $this->prodCode;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->appParams) {
            $res['app_params'] = [];
            if (null !== $this->appParams && \is_array($this->appParams)) {
                $n = 0;
                foreach ($this->appParams as $item) {
                    $res['app_params'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AppParamData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['prod_code'])) {
            $model->prodCode = $map['prod_code'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['app_params'])) {
            if (!empty($map['app_params'])) {
                $model->appParams = [];
                $n                = 0;
                foreach ($map['app_params'] as $item) {
                    $model->appParams[$n++] = null !== $item ? ParamData::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
