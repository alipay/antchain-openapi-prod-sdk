<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class ContainerServiceDeployment extends Model
{
    // 容器服务名称。
    /**
     * @example nginx
     *
     * @var string
     */
    public $containerServiceName;

    // 容器服务版本号。
    /**
     * @example nginx.herf93jkd
     *
     * @var string
     */
    public $containerServiceRevision;

    // 依赖的容器应用服务名称。
    /**
     * @example []
     *
     * @var string[]
     */
    public $dependContainerServiceNames;

    // 限定需要发布的部署单元
    /**
     * @example [RZ00A]
     *
     * @var string[]
     */
    public $restrictedCells;

    // 自定义发布批次
    /**
     * @example []
     *
     * @var ReleaseBatchObj[]
     */
    public $batches;

    // 默认ByIndex
    /**
     * @example ByIndex
     *
     * @var string
     */
    public $upgradePolicy;

    // 发布模板名称
    /**
     * @example TEST
     *
     * @var string
     */
    public $deploymentTemplateName;

    // 发布模板卡点规则
    /**
     * @example []
     *
     * @var CustomHook[]
     */
    public $deploymentTemplateHooks;
    protected $_name = [
        'containerServiceName'        => 'container_service_name',
        'containerServiceRevision'    => 'container_service_revision',
        'dependContainerServiceNames' => 'depend_container_service_names',
        'restrictedCells'             => 'restricted_cells',
        'batches'                     => 'batches',
        'upgradePolicy'               => 'upgrade_policy',
        'deploymentTemplateName'      => 'deployment_template_name',
        'deploymentTemplateHooks'     => 'deployment_template_hooks',
    ];

    public function validate()
    {
        Model::validateRequired('containerServiceName', $this->containerServiceName, true);
        Model::validateRequired('containerServiceRevision', $this->containerServiceRevision, true);
        Model::validateRequired('dependContainerServiceNames', $this->dependContainerServiceNames, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->containerServiceName) {
            $res['container_service_name'] = $this->containerServiceName;
        }
        if (null !== $this->containerServiceRevision) {
            $res['container_service_revision'] = $this->containerServiceRevision;
        }
        if (null !== $this->dependContainerServiceNames) {
            $res['depend_container_service_names'] = $this->dependContainerServiceNames;
        }
        if (null !== $this->restrictedCells) {
            $res['restricted_cells'] = $this->restrictedCells;
        }
        if (null !== $this->batches) {
            $res['batches'] = [];
            if (null !== $this->batches && \is_array($this->batches)) {
                $n = 0;
                foreach ($this->batches as $item) {
                    $res['batches'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->upgradePolicy) {
            $res['upgrade_policy'] = $this->upgradePolicy;
        }
        if (null !== $this->deploymentTemplateName) {
            $res['deployment_template_name'] = $this->deploymentTemplateName;
        }
        if (null !== $this->deploymentTemplateHooks) {
            $res['deployment_template_hooks'] = [];
            if (null !== $this->deploymentTemplateHooks && \is_array($this->deploymentTemplateHooks)) {
                $n = 0;
                foreach ($this->deploymentTemplateHooks as $item) {
                    $res['deployment_template_hooks'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContainerServiceDeployment
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['container_service_name'])) {
            $model->containerServiceName = $map['container_service_name'];
        }
        if (isset($map['container_service_revision'])) {
            $model->containerServiceRevision = $map['container_service_revision'];
        }
        if (isset($map['depend_container_service_names'])) {
            if (!empty($map['depend_container_service_names'])) {
                $model->dependContainerServiceNames = $map['depend_container_service_names'];
            }
        }
        if (isset($map['restricted_cells'])) {
            if (!empty($map['restricted_cells'])) {
                $model->restrictedCells = $map['restricted_cells'];
            }
        }
        if (isset($map['batches'])) {
            if (!empty($map['batches'])) {
                $model->batches = [];
                $n              = 0;
                foreach ($map['batches'] as $item) {
                    $model->batches[$n++] = null !== $item ? ReleaseBatchObj::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['upgrade_policy'])) {
            $model->upgradePolicy = $map['upgrade_policy'];
        }
        if (isset($map['deployment_template_name'])) {
            $model->deploymentTemplateName = $map['deployment_template_name'];
        }
        if (isset($map['deployment_template_hooks'])) {
            if (!empty($map['deployment_template_hooks'])) {
                $model->deploymentTemplateHooks = [];
                $n                              = 0;
                foreach ($map['deployment_template_hooks'] as $item) {
                    $model->deploymentTemplateHooks[$n++] = null !== $item ? CustomHook::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
