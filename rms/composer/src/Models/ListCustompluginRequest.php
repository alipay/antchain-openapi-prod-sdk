<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class ListCustompluginRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 工作空间名称
    /**
     * @var string
     */
    public $workspaceName;

    // 插件类型
    /**
     * @var string
     */
    public $pluginType;

    // 过滤类型
    /**
     * @var string
     */
    public $filterType;

    // 过滤条件，如app名称
    /**
     * @var string
     */
    public $filter;
    protected $_name = [
        'authToken'     => 'auth_token',
        'workspaceName' => 'workspace_name',
        'pluginType'    => 'plugin_type',
        'filterType'    => 'filter_type',
        'filter'        => 'filter',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceName', $this->workspaceName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->workspaceName) {
            $res['workspace_name'] = $this->workspaceName;
        }
        if (null !== $this->pluginType) {
            $res['plugin_type'] = $this->pluginType;
        }
        if (null !== $this->filterType) {
            $res['filter_type'] = $this->filterType;
        }
        if (null !== $this->filter) {
            $res['filter'] = $this->filter;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListCustompluginRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['workspace_name'])) {
            $model->workspaceName = $map['workspace_name'];
        }
        if (isset($map['plugin_type'])) {
            $model->pluginType = $map['plugin_type'];
        }
        if (isset($map['filter_type'])) {
            $model->filterType = $map['filter_type'];
        }
        if (isset($map['filter'])) {
            $model->filter = $map['filter'];
        }

        return $model;
    }
}
