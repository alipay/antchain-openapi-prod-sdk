<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class MonitorProviderType extends Model
{
    // 监测文件类型
    /**
     * @example txt
     *
     * @var string
     */
    public $fileType;

    // 提交类型
    /**
     * @example FILE
     *
     * @var string
     */
    public $submitType;

    // 文件格式
    /**
     * @example jpg
     *
     * @var string
     */
    public $fileFormat;

    // 支持的服务商列表，已排序
    /**
     * @example
     *
     * @var MonitorProviderCapability[]
     */
    public $monitorProviders;
    protected $_name = [
        'fileType'         => 'file_type',
        'submitType'       => 'submit_type',
        'fileFormat'       => 'file_format',
        'monitorProviders' => 'monitor_providers',
    ];

    public function validate()
    {
        Model::validateRequired('fileType', $this->fileType, true);
        Model::validateRequired('submitType', $this->submitType, true);
        Model::validateRequired('monitorProviders', $this->monitorProviders, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->fileType) {
            $res['file_type'] = $this->fileType;
        }
        if (null !== $this->submitType) {
            $res['submit_type'] = $this->submitType;
        }
        if (null !== $this->fileFormat) {
            $res['file_format'] = $this->fileFormat;
        }
        if (null !== $this->monitorProviders) {
            $res['monitor_providers'] = [];
            if (null !== $this->monitorProviders && \is_array($this->monitorProviders)) {
                $n = 0;
                foreach ($this->monitorProviders as $item) {
                    $res['monitor_providers'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MonitorProviderType
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['file_type'])) {
            $model->fileType = $map['file_type'];
        }
        if (isset($map['submit_type'])) {
            $model->submitType = $map['submit_type'];
        }
        if (isset($map['file_format'])) {
            $model->fileFormat = $map['file_format'];
        }
        if (isset($map['monitor_providers'])) {
            if (!empty($map['monitor_providers'])) {
                $model->monitorProviders = [];
                $n                       = 0;
                foreach ($map['monitor_providers'] as $item) {
                    $model->monitorProviders[$n++] = null !== $item ? MonitorProviderCapability::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
