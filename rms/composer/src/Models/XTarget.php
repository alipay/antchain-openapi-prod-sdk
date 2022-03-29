<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class XTarget extends Model
{
    // target type
    /**
     * @example metadata
     *
     * @var string
     */
    public $type;

    // resource kind
    /**
     * @example sofacloud
     *
     * @var string
     */
    public $metadataKind;

    // resource name
    /**
     * @example sofa_server
     *
     * @var string
     */
    public $metadataName;

    // where 条件
    /**
     * @example
     *
     * @var XCondition[]
     */
    public $conditions;

    /**
     * @example APP|MACHINE|CONTAINER|CUSTOM
     *
     * @var string
     */
    public $frontType;

    /**
     * @example
     *
     * @var string
     */
    public $fromDatasourceUuid;

    /**
     * @example
     *
     * @var string
     */
    public $fromDatasourceName;

    /**
     * @example
     *
     * @var string
     */
    public $fromDatasourceMd5;

    /**
     * @example
     *
     * @var string
     */
    public $fromDatasourceMetricName;
    protected $_name = [
        'type'                     => 'type',
        'metadataKind'             => 'metadata_kind',
        'metadataName'             => 'metadata_name',
        'conditions'               => 'conditions',
        'frontType'                => 'front_type',
        'fromDatasourceUuid'       => 'from_datasource_uuid',
        'fromDatasourceName'       => 'from_datasource_name',
        'fromDatasourceMd5'        => 'from_datasource_md5',
        'fromDatasourceMetricName' => 'from_datasource_metric_name',
    ];

    public function validate()
    {
        Model::validateRequired('type', $this->type, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->metadataKind) {
            $res['metadata_kind'] = $this->metadataKind;
        }
        if (null !== $this->metadataName) {
            $res['metadata_name'] = $this->metadataName;
        }
        if (null !== $this->conditions) {
            $res['conditions'] = [];
            if (null !== $this->conditions && \is_array($this->conditions)) {
                $n = 0;
                foreach ($this->conditions as $item) {
                    $res['conditions'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->frontType) {
            $res['front_type'] = $this->frontType;
        }
        if (null !== $this->fromDatasourceUuid) {
            $res['from_datasource_uuid'] = $this->fromDatasourceUuid;
        }
        if (null !== $this->fromDatasourceName) {
            $res['from_datasource_name'] = $this->fromDatasourceName;
        }
        if (null !== $this->fromDatasourceMd5) {
            $res['from_datasource_md5'] = $this->fromDatasourceMd5;
        }
        if (null !== $this->fromDatasourceMetricName) {
            $res['from_datasource_metric_name'] = $this->fromDatasourceMetricName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return XTarget
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['metadata_kind'])) {
            $model->metadataKind = $map['metadata_kind'];
        }
        if (isset($map['metadata_name'])) {
            $model->metadataName = $map['metadata_name'];
        }
        if (isset($map['conditions'])) {
            if (!empty($map['conditions'])) {
                $model->conditions = [];
                $n                 = 0;
                foreach ($map['conditions'] as $item) {
                    $model->conditions[$n++] = null !== $item ? XCondition::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['front_type'])) {
            $model->frontType = $map['front_type'];
        }
        if (isset($map['from_datasource_uuid'])) {
            $model->fromDatasourceUuid = $map['from_datasource_uuid'];
        }
        if (isset($map['from_datasource_name'])) {
            $model->fromDatasourceName = $map['from_datasource_name'];
        }
        if (isset($map['from_datasource_md5'])) {
            $model->fromDatasourceMd5 = $map['from_datasource_md5'];
        }
        if (isset($map['from_datasource_metric_name'])) {
            $model->fromDatasourceMetricName = $map['from_datasource_metric_name'];
        }

        return $model;
    }
}
