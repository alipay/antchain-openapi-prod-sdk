<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_bc907d13969a4eb68852866122b96ffd\Models;

use AlibabaCloud\Tea\Model;

class CreateItagAntitagTaskRequestRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // taskname
    /**
     * @var string
     */
    public $taskname;

    // templateid
    /**
     * @var string
     */
    public $templateid;

    // projectid
    /**
     * @var string
     */
    public $projectid;

    // AssignConfig
    /**
     * @var AssignConfig
     */
    public $assignconfig;

    // TaskWorkFlow
    /**
     * @var ITagTaskWorkflowConfig
     */
    public $taskworkflow;

    // admins
    /**
     * @var Admins[]
     */
    public $admins;

    // datasetproxyrelations
    /**
     * @var DatasetProxyRelations[]
     */
    public $datasetproxyrelations;

    // bizinfo
    /**
     * @var BizInfo
     */
    public $bizinfo;

    // tasktemplateconfig
    /**
     * @var TaskTemplateConfig
     */
    public $tasktemplateconfig;

    // Exif
    /**
     * @var Exif
     */
    public $exif;

    // tntinstid
    /**
     * @var string
     */
    public $tntinstid;
    protected $_name = [
        'authToken'             => 'auth_token',
        'productInstanceId'     => 'product_instance_id',
        'taskname'              => 'taskname',
        'templateid'            => 'templateid',
        'projectid'             => 'projectid',
        'assignconfig'          => 'assignconfig',
        'taskworkflow'          => 'taskworkflow',
        'admins'                => 'admins',
        'datasetproxyrelations' => 'datasetproxyrelations',
        'bizinfo'               => 'bizinfo',
        'tasktemplateconfig'    => 'tasktemplateconfig',
        'exif'                  => 'exif',
        'tntinstid'             => 'tntinstid',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->taskname) {
            $res['taskname'] = $this->taskname;
        }
        if (null !== $this->templateid) {
            $res['templateid'] = $this->templateid;
        }
        if (null !== $this->projectid) {
            $res['projectid'] = $this->projectid;
        }
        if (null !== $this->assignconfig) {
            $res['assignconfig'] = null !== $this->assignconfig ? $this->assignconfig->toMap() : null;
        }
        if (null !== $this->taskworkflow) {
            $res['taskworkflow'] = null !== $this->taskworkflow ? $this->taskworkflow->toMap() : null;
        }
        if (null !== $this->admins) {
            $res['admins'] = [];
            if (null !== $this->admins && \is_array($this->admins)) {
                $n = 0;
                foreach ($this->admins as $item) {
                    $res['admins'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->datasetproxyrelations) {
            $res['datasetproxyrelations'] = [];
            if (null !== $this->datasetproxyrelations && \is_array($this->datasetproxyrelations)) {
                $n = 0;
                foreach ($this->datasetproxyrelations as $item) {
                    $res['datasetproxyrelations'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->bizinfo) {
            $res['bizinfo'] = null !== $this->bizinfo ? $this->bizinfo->toMap() : null;
        }
        if (null !== $this->tasktemplateconfig) {
            $res['tasktemplateconfig'] = null !== $this->tasktemplateconfig ? $this->tasktemplateconfig->toMap() : null;
        }
        if (null !== $this->exif) {
            $res['exif'] = null !== $this->exif ? $this->exif->toMap() : null;
        }
        if (null !== $this->tntinstid) {
            $res['tntinstid'] = $this->tntinstid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateItagAntitagTaskRequestRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['taskname'])) {
            $model->taskname = $map['taskname'];
        }
        if (isset($map['templateid'])) {
            $model->templateid = $map['templateid'];
        }
        if (isset($map['projectid'])) {
            $model->projectid = $map['projectid'];
        }
        if (isset($map['assignconfig'])) {
            $model->assignconfig = AssignConfig::fromMap($map['assignconfig']);
        }
        if (isset($map['taskworkflow'])) {
            $model->taskworkflow = ITagTaskWorkflowConfig::fromMap($map['taskworkflow']);
        }
        if (isset($map['admins'])) {
            if (!empty($map['admins'])) {
                $model->admins = [];
                $n             = 0;
                foreach ($map['admins'] as $item) {
                    $model->admins[$n++] = null !== $item ? Admins::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['datasetproxyrelations'])) {
            if (!empty($map['datasetproxyrelations'])) {
                $model->datasetproxyrelations = [];
                $n                            = 0;
                foreach ($map['datasetproxyrelations'] as $item) {
                    $model->datasetproxyrelations[$n++] = null !== $item ? DatasetProxyRelations::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['bizinfo'])) {
            $model->bizinfo = BizInfo::fromMap($map['bizinfo']);
        }
        if (isset($map['tasktemplateconfig'])) {
            $model->tasktemplateconfig = TaskTemplateConfig::fromMap($map['tasktemplateconfig']);
        }
        if (isset($map['exif'])) {
            $model->exif = Exif::fromMap($map['exif']);
        }
        if (isset($map['tntinstid'])) {
            $model->tntinstid = $map['tntinstid'];
        }

        return $model;
    }
}
