<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class ProdInfo extends Model
{
    // 应用实例信息
    /**
     * @example aaa
     *
     * @var AppInfo[]
     */
    public $appInfos;

    // 产品名
    /**
     * @example xxx_name
     *
     * @var string
     */
    public $prodName;

    // prod version
    /**
     * @example 1.1
     *
     * @var string
     */
    public $prodVersion;
    protected $_name = [
        'appInfos'    => 'app_infos',
        'prodName'    => 'prod_name',
        'prodVersion' => 'prod_version',
    ];

    public function validate()
    {
        Model::validateRequired('appInfos', $this->appInfos, true);
        Model::validateRequired('prodName', $this->prodName, true);
        Model::validateRequired('prodVersion', $this->prodVersion, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->appInfos) {
            $res['app_infos'] = [];
            if (null !== $this->appInfos && \is_array($this->appInfos)) {
                $n = 0;
                foreach ($this->appInfos as $item) {
                    $res['app_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->prodName) {
            $res['prod_name'] = $this->prodName;
        }
        if (null !== $this->prodVersion) {
            $res['prod_version'] = $this->prodVersion;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ProdInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['app_infos'])) {
            if (!empty($map['app_infos'])) {
                $model->appInfos = [];
                $n               = 0;
                foreach ($map['app_infos'] as $item) {
                    $model->appInfos[$n++] = null !== $item ? AppInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['prod_name'])) {
            $model->prodName = $map['prod_name'];
        }
        if (isset($map['prod_version'])) {
            $model->prodVersion = $map['prod_version'];
        }

        return $model;
    }
}
