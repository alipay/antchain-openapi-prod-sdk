<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDATAGW\Models;

use AlibabaCloud\Tea\Model;

class AddressTimelineConfig extends Model
{
    // 交易时间轴看板高度
    /**
     * @example 500
     *
     * @var int
     */
    public $widgetHeight;

    // 接口业务字段配置列表，更新时只需传入需要更新的方法
    /**
     * @example
     *
     * @var InterfaceDataModelConfig[]
     */
    public $interfaceDataModelConfigs;
    protected $_name = [
        'widgetHeight'              => 'widget_height',
        'interfaceDataModelConfigs' => 'interface_data_model_configs',
    ];

    public function validate()
    {
        Model::validateMaximum('widgetHeight', $this->widgetHeight, 1000);
        Model::validateMinimum('widgetHeight', $this->widgetHeight, 300);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->widgetHeight) {
            $res['widget_height'] = $this->widgetHeight;
        }
        if (null !== $this->interfaceDataModelConfigs) {
            $res['interface_data_model_configs'] = [];
            if (null !== $this->interfaceDataModelConfigs && \is_array($this->interfaceDataModelConfigs)) {
                $n = 0;
                foreach ($this->interfaceDataModelConfigs as $item) {
                    $res['interface_data_model_configs'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddressTimelineConfig
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['widget_height'])) {
            $model->widgetHeight = $map['widget_height'];
        }
        if (isset($map['interface_data_model_configs'])) {
            if (!empty($map['interface_data_model_configs'])) {
                $model->interfaceDataModelConfigs = [];
                $n                                = 0;
                foreach ($map['interface_data_model_configs'] as $item) {
                    $model->interfaceDataModelConfigs[$n++] = null !== $item ? InterfaceDataModelConfig::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
