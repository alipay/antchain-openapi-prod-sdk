<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class Volume extends Model
{
    // 主机目录[仅针对HostPath类型volume有效]
    /**
     * @example /home/admin
     *
     * @var string
     */
    public $hostPath;

    // Volume名称。
    /**
     * @example test-volume
     *
     * @var string
     */
    public $name;

    // 关联的资源名称。
    /**
     * @example secret_name
     *
     * @var string
     */
    public $refResourceName;

    // LOCAL_STORAGE：主机挂载|CONFIGMAP：配置项|SECRET：保密字典
    /**
     * @example LOCAL_STORAGE/SECRET/CONFIGMAP
     *
     * @var string
     */
    public $type;

    // Volume是否只读
    /**
     * @example true, false
     *
     * @var bool
     */
    public $readOnly;
    protected $_name = [
        'hostPath'        => 'host_path',
        'name'            => 'name',
        'refResourceName' => 'ref_resource_name',
        'type'            => 'type',
        'readOnly'        => 'read_only',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('type', $this->type, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->hostPath) {
            $res['host_path'] = $this->hostPath;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->refResourceName) {
            $res['ref_resource_name'] = $this->refResourceName;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->readOnly) {
            $res['read_only'] = $this->readOnly;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Volume
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['host_path'])) {
            $model->hostPath = $map['host_path'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['ref_resource_name'])) {
            $model->refResourceName = $map['ref_resource_name'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['read_only'])) {
            $model->readOnly = $map['read_only'];
        }

        return $model;
    }
}
