<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_a050edd0f07344eabd879166e7187ce5\Models;

use AlibabaCloud\Tea\Model;

class OutboundDialogFlowDetailResponseData extends Model
{
    // 数据库自增id
    /**
     * @example
     *
     * @var int
     */
    public $id;

    // 前端生成的随机字符串id
    /**
     * @example di89es8
     *
     * @var string
     */
    public $feId;

    // 流程名称
    /**
     * @example ss
     *
     * @var string
     */
    public $name;

    // 流程当前版本号
    /**
     * @example
     *
     * @var int
     */
    public $version;

    // 流程版本号集合
    /**
     * @example
     *
     * @var int[]
     */
    public $versions;

    // 全局配置
    /**
     * @example ss
     *
     * @var string
     */
    public $globalConfig;

    // 流程类型
    /**
     * @example MAIN
     *
     * @var string
     */
    public $type;

    // 暂存code
    /**
     * @example default
     *
     * @var string
     */
    public $temporaryStorageCode;

    // 视频播报类型
    /**
     * @example VIDEO
     *
     * @var string
     */
    public $flowInteractiveType;

    // 流程图边数据
    /**
     * @example
     *
     * @var Edge[]
     */
    public $edges;

    // 流程图节点数据
    /**
     * @example
     *
     * @var Node[]
     */
    public $nodes;
    protected $_name = [
        'id'                   => 'id',
        'feId'                 => 'fe_id',
        'name'                 => 'name',
        'version'              => 'version',
        'versions'             => 'versions',
        'globalConfig'         => 'global_config',
        'type'                 => 'type',
        'temporaryStorageCode' => 'temporary_storage_code',
        'flowInteractiveType'  => 'flow_interactive_type',
        'edges'                => 'edges',
        'nodes'                => 'nodes',
    ];

    public function validate()
    {
        Model::validateRequired('feId', $this->feId, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('version', $this->version, true);
        Model::validateRequired('versions', $this->versions, true);
        Model::validateRequired('globalConfig', $this->globalConfig, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('temporaryStorageCode', $this->temporaryStorageCode, true);
        Model::validateRequired('flowInteractiveType', $this->flowInteractiveType, true);
        Model::validateRequired('edges', $this->edges, true);
        Model::validateRequired('nodes', $this->nodes, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->feId) {
            $res['fe_id'] = $this->feId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }
        if (null !== $this->versions) {
            $res['versions'] = $this->versions;
        }
        if (null !== $this->globalConfig) {
            $res['global_config'] = $this->globalConfig;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->temporaryStorageCode) {
            $res['temporary_storage_code'] = $this->temporaryStorageCode;
        }
        if (null !== $this->flowInteractiveType) {
            $res['flow_interactive_type'] = $this->flowInteractiveType;
        }
        if (null !== $this->edges) {
            $res['edges'] = [];
            if (null !== $this->edges && \is_array($this->edges)) {
                $n = 0;
                foreach ($this->edges as $item) {
                    $res['edges'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->nodes) {
            $res['nodes'] = [];
            if (null !== $this->nodes && \is_array($this->nodes)) {
                $n = 0;
                foreach ($this->nodes as $item) {
                    $res['nodes'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OutboundDialogFlowDetailResponseData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['fe_id'])) {
            $model->feId = $map['fe_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['version'])) {
            $model->version = $map['version'];
        }
        if (isset($map['versions'])) {
            if (!empty($map['versions'])) {
                $model->versions = $map['versions'];
            }
        }
        if (isset($map['global_config'])) {
            $model->globalConfig = $map['global_config'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['temporary_storage_code'])) {
            $model->temporaryStorageCode = $map['temporary_storage_code'];
        }
        if (isset($map['flow_interactive_type'])) {
            $model->flowInteractiveType = $map['flow_interactive_type'];
        }
        if (isset($map['edges'])) {
            if (!empty($map['edges'])) {
                $model->edges = [];
                $n            = 0;
                foreach ($map['edges'] as $item) {
                    $model->edges[$n++] = null !== $item ? Edge::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['nodes'])) {
            if (!empty($map['nodes'])) {
                $model->nodes = [];
                $n            = 0;
                foreach ($map['nodes'] as $item) {
                    $model->nodes[$n++] = null !== $item ? Node::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
