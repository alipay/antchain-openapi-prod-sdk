<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TRADE\Models;

use AlibabaCloud\Tea\Model;

class Combo extends Model
{
    // 套餐名称
    /**
     * @example 测试套餐
     *
     * @var string
     */
    public $code;

    // 套餐编码
    /**
     * @example KKAASP00001001
     *
     * @var string
     */
    public $name;

    // 套餐版本号
    /**
     * @example SPV202105192651
     *
     * @var string
     */
    public $vid;

    // 套餐描述
    /**
     * @example 这是一个套餐
     *
     * @var string
     */
    public $description;

    // 扩展信息，JSON结构，包含标签、个性化配置等数据
    /**
     * @example {"key":"name"}
     *
     * @var string
     */
    public $extendsConfig;

    // 状态
    /**
     * @example ONLINE
     *
     * @var string
     */
    public $status;

    // 套餐内商品列表
    /**
     * @example []
     *
     * @var ComboCommodity[]
     */
    public $commodities;
    protected $_name = [
        'code'          => 'code',
        'name'          => 'name',
        'vid'           => 'vid',
        'description'   => 'description',
        'extendsConfig' => 'extends_config',
        'status'        => 'status',
        'commodities'   => 'commodities',
    ];

    public function validate()
    {
        Model::validateRequired('code', $this->code, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('vid', $this->vid, true);
        Model::validateRequired('description', $this->description, true);
        Model::validateRequired('extendsConfig', $this->extendsConfig, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('commodities', $this->commodities, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->vid) {
            $res['vid'] = $this->vid;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->extendsConfig) {
            $res['extends_config'] = $this->extendsConfig;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->commodities) {
            $res['commodities'] = [];
            if (null !== $this->commodities && \is_array($this->commodities)) {
                $n = 0;
                foreach ($this->commodities as $item) {
                    $res['commodities'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Combo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['vid'])) {
            $model->vid = $map['vid'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['extends_config'])) {
            $model->extendsConfig = $map['extends_config'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['commodities'])) {
            if (!empty($map['commodities'])) {
                $model->commodities = [];
                $n                  = 0;
                foreach ($map['commodities'] as $item) {
                    $model->commodities[$n++] = null !== $item ? ComboCommodity::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
