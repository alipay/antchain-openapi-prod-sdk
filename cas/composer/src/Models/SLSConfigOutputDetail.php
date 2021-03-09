<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class SLSConfigOutputDetail extends Model
{
    // 项目名称，必须为请求的project名。
    /**
     * @example k8s-log-custom-pbyyzncn-aks1128test-test
     *
     * @var string
     */
    public $projectName;

    // 日志库名称
    /**
     * @example testLogStore
     *
     * @var string
     */
    public $logstoreName;
    protected $_name = [
        'projectName'  => 'project_name',
        'logstoreName' => 'logstore_name',
    ];

    public function validate()
    {
        Model::validateRequired('projectName', $this->projectName, true);
        Model::validateRequired('logstoreName', $this->logstoreName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->projectName) {
            $res['project_name'] = $this->projectName;
        }
        if (null !== $this->logstoreName) {
            $res['logstore_name'] = $this->logstoreName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SLSConfigOutputDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['project_name'])) {
            $model->projectName = $map['project_name'];
        }
        if (isset($map['logstore_name'])) {
            $model->logstoreName = $map['logstore_name'];
        }

        return $model;
    }
}
