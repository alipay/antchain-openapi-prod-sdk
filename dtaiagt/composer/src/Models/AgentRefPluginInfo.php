<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTAIAGT\Models;

use AlibabaCloud\Tea\Model;

class AgentRefPluginInfo extends Model
{
    // 工具id
    //
    /**
     * @example 1
     *
     * @var string
     */
    public $id;

    // 构建版本号
    //
    /**
     * @example "v1.0.0"
     *
     * @var string
     */
    public $buildVersion;

    // 入参预设值表 Map<String, String>
    /**
     * @example {}
     *
     * @var string
     */
    public $paramValueMap;

    // 入参预设值表，原param_value_map字段，Map<String, String>格式
    //
    /**
     * @example {}
     *
     * @var string
     */
    public $paramValueMapJson;

    // 关联的语料
    /**
     * @example
     *
     * @var string[]
     */
    public $corpus;
    protected $_name = [
        'id'                => 'id',
        'buildVersion'      => 'build_version',
        'paramValueMap'     => 'param_value_map',
        'paramValueMapJson' => 'param_value_map_json',
        'corpus'            => 'corpus',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('buildVersion', $this->buildVersion, true);
        Model::validateRequired('paramValueMap', $this->paramValueMap, true);
        Model::validateRequired('paramValueMapJson', $this->paramValueMapJson, true);
        Model::validateRequired('corpus', $this->corpus, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->buildVersion) {
            $res['build_version'] = $this->buildVersion;
        }
        if (null !== $this->paramValueMap) {
            $res['param_value_map'] = $this->paramValueMap;
        }
        if (null !== $this->paramValueMapJson) {
            $res['param_value_map_json'] = $this->paramValueMapJson;
        }
        if (null !== $this->corpus) {
            $res['corpus'] = $this->corpus;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AgentRefPluginInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['build_version'])) {
            $model->buildVersion = $map['build_version'];
        }
        if (isset($map['param_value_map'])) {
            $model->paramValueMap = $map['param_value_map'];
        }
        if (isset($map['param_value_map_json'])) {
            $model->paramValueMapJson = $map['param_value_map_json'];
        }
        if (isset($map['corpus'])) {
            if (!empty($map['corpus'])) {
                $model->corpus = $map['corpus'];
            }
        }

        return $model;
    }
}
